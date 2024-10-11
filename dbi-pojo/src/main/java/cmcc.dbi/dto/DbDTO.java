package cmcc.dbi.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * 选择数据库传递的数据模型
 */
// TODO：没定，没法写
@Data
@ApiModel(description = "选择数据库传递的数据模型")
public class DbDTO implements Serializable {
    private Long dbId;

    // 数据库名
    private String dbName;

    // 数据库类型
    private String dbType;

    // OS平台
    private String osPlatform;

    // 网络域
    private String domain;

    //所属部门
    private String department;

    // 标准业务系统
    private String standardSystem;

    // 系统别名或子模块
    private String systemAlias;

    // 资源池
    private String resourcePool;

    // 主机名
    private String hostName;
}
