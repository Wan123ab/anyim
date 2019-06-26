package com.anoyi.controller;

import com.anoyi.bean.NetworkLink;
import com.anoyi.mongo.repository.NetworkLinkRepository;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created by Anoy on 2017/4/21.
 */
@Controller
@AllArgsConstructor
@CrossOrigin("*")
@Log4j2
public class PageController {

    private final NetworkLinkRepository networkLinkRepository;

    @GetMapping("/")
    public String index(Model model) {
        return "login";
    }

    @GetMapping("/home")
    public String home(Model model) {
        List<NetworkLink> links = networkLinkRepository.findAll(Sort.by(Sort.Direction.ASC, "order"));
        model.addAttribute("links", links);
        return "home";
    }

    @GetMapping("/login")
    public String login() {
        return "chat";
    }

}
