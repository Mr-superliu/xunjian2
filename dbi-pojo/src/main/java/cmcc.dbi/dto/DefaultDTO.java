package cmcc.dbi.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 创建默认巡检传递的数据模型
 */
@Data
@ApiModel(description = "创建默认巡检传递的数据模型")
public class DefaultDTO implements Serializable {
    private Long planId;

    // 巡检任务名称
    private String planName;

    // 创建人
    private String createPeople;

    // 创建时间
    private LocalDateTime createTime;

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

    // 选择的巡检数据库 (示例:"1,2,4,8")
    private String dbId;
}
