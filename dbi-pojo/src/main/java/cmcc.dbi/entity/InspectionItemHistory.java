package cmcc.dbi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 巡检项记录表实体类
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InspectionItemHistory implements Serializable {
    private Long historyItemId;

    // 从属的巡检记录id
    private Long historyId;

    // 巡检项id
    private Long itemId;

    // 巡检项名称
    private String itemName;

    // 数据库类型
    private String dbType;

    // 查询结果状态
    private Integer resultStatus;

    // 错误描述
    private String errorDesc;

    // 告警级别
    private Integer alarmLevel;

    // 实际查询阈值
    private Integer actualThreshold;

    // 单位
    private String unit;

    // 巡检项类别
    private Integer itemType;
}
