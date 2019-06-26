package com.anoyi.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * 全局自定义属性配置
 */
@Configuration
@ConfigurationProperties("custom")
@Data
public class CustomAttributesConfig {

    // github 地址
    private String githubUrl;

    // 其他代码仓库地址
    private String gitlabUrl;

    // qq
    private String qq;

    // ICP 备案号
    private String icp;

    // 打赏二维码
    private List<String> rewardImages;

    // 打赏描述
    private String rewardDesc;

    // 暗号
    private String secret;

}
