package com.anoyi.bean;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * 社交网络
 */
@Data
public class NetworkLink {

    @Id
    private String id;

    // Logo
    private String logo;

    // 网站名称
    private String name;

    // 描述
    private String desc;

    // 地址
    private String url;

    // 排序
    private Integer order;

}
