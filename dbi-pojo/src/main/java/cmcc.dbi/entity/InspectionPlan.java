package cmcc.dbi.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 巡检计划表实体类
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InspectionPlan implements Serializable {
    private Long planId;

    // 巡检任务名称
    private String planName;

    // 创建人
    private String createPeople;

    // 巡检类型：0-默认巡检，1-专项巡检，2-深度巡检
    private Integer inceptionType;

    // 创建时间
    private LocalDateTime createTime;

    // 更新时间
    private LocalDateTime updateTime;

    // 执行类别: 0-立即执行，1-定时执行，2-周期执行
    private Integer execType;

    // 本条计划执行时间
    private LocalDateTime startTime;

    // 执行频率：0-每天，1-每周，2-每月
    private Integer execFreq;

    // 已执行次数
    private Integer execTime;

    // 总执行次数
    private Integer totalExecTime;

    // 选择的巡检模板(只有一个id号)
    private Long modelId;

    // 选择的巡检数据库 (示例:"1,2,4,8")
    private String dbId;

}
