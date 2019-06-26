package com.anoyi.bean;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * 抖音用户
 */
@Data
public class DouyinUser {

    @Id
    private String id;

    private String avatar;

    private String nickname;

}
