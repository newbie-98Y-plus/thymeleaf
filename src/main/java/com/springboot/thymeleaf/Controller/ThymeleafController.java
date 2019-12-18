package com.springboot.thymeleaf.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author
 * @version 1.0
 * @date 2019/12/18
 */
@Controller
public class ThymeleafController {

    @GetMapping("/first")
    public String indexPage(Model model) {
        String message = "Hello, Thymeleaf!";
        model.addAttribute("message", message);
        return "index";
    }
}
