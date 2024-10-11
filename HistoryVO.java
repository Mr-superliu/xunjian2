package cmcc.dbi.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import cmcc.dbi.entity.InspectionHistory;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * 查看巡检记录视图对象
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HistoryVO implements Serializable {
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

    // 巡检对象数量
    private Integer inceptionItemNum;

    // 异常对象数量
    private Integer errorItemNum;
}
