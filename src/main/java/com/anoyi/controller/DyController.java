package com.anoyi.controller;

import com.anoyi.bean.DouyinUser;
import com.anoyi.mongo.repository.DouyinRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
@AllArgsConstructor
public class DyController {

    private final DouyinRepository douyinRepository;

    @GetMapping("/dy/top")
    public String book(Model model){
        List<DouyinUser> douyinUsers = douyinRepository.findAll();
        model.addAttribute("users", douyinUsers);
        return "dy-top";
    }

    @GetMapping("/dy/{id}")
    public String article(@PathVariable String id, Model model){
        model.addAttribute("dyId", id);
        return "dy-user";
    }

}
