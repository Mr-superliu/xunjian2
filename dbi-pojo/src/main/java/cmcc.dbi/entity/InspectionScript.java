package cmcc.dbi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 巡检脚本实体类
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InspectionScript implements Serializable {
    // 主键：脚本id
    private Long scriptId;

    // 脚本类型
    private Integer scriptType;

    // 技术栈类型
    private Integer techStack;

    // 数据库版本号
    private String dbVersion;

    // 操作系统类型
    private Integer osType;

    // 描述
    private String description;
}
