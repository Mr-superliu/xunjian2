package cmcc.dbi.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/**
 * 查看模板配置视图对象
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SetModelVO implements Serializable {
    private Long modelId;

    // 巡检模板名称
    private String modelName;

    // 数据库类型
    private String dbType;

    // 巡检模板描述
    private String modelDesc;
}
