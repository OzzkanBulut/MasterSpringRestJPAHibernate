package org.demo._020_EazySchoolApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping({"/hello"})
    public String sayHello(Model model) {

        model.addAttribute("userName", "Özkann");
        return "hello";
    }


}
