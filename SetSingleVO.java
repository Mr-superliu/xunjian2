package cmcc.dbi.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/**
 * 查看单库默认巡检项视图对象
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SetSingleVO implements Serializable {
    private Long typeId;

    // 数据库类型
    private String dbType;

    // 巡检项描述
    private String itemDesc;
}
