package cmcc.dbi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * 巡检记录表实体类
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InspectionHistory implements Serializable {
    private Long historyId;

    // 巡检任务记录名称
    private Long historyName;

    // 创建人
    private String createPeople;

    // 巡检开始时间
    private LocalDateTime startTime;

    // 巡检结束时间
    private LocalDateTime endTime;

    // 执行类别
    private Integer execType;

    // 巡检类型
    private Integer inspectionType;

    // 巡检状态
    private Integer inspectionStatus;

    // 巡检模板
    private Long modelId;

    // 巡检数据库 (示例:"1,2,4,8")
    private String dbId;

    // 巡检对象数量
    private Integer inceptionItemNum;

    // 异常对象数量
    private Integer errorItemNum;

    // 巡检报告文件路径
    private String reportPath;

}
