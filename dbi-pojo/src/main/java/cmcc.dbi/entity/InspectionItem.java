package cmcc.dbi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 巡检项表实体类
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InspectionItem implements Serializable {
    private Long itemId;

    // 巡检项名称
    private String itemName;

    // 数据库类型
    private String dbType;

    // 巡检项描述
    private String itemDesc;

    // 巡检项级别
    private Integer itemLevel;

    // 默认健康阈值
    private Integer defaultThreshold;

    // 单位
    private String unit;

    // 条件
    private String condition;

    // 巡检项类别
    private Integer itemType;

    // 巡检sql脚本
    private String sqlScript;
}
