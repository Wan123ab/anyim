package com.anoyi.controller;

import com.anoyi.config.CustomAttributesConfig;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class AboutController {

    private final CustomAttributesConfig customAttributesConfig;

    /**
     * About Me
     */
    @GetMapping(value = "/about")
    public String chat(@RequestParam(required = false) String secret, @RequestParam(required = false, defaultValue = "zh") String lang) {
        if (!StringUtils.isEmpty(secret) && secret.equals(customAttributesConfig.getSecret())){
            return lang.equals("en") ? "about-en" : "about";
        }
        return "about-check";
    }

}
