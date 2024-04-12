package org.demo._020_EazySchoolApplication.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class DashboardController {

    @GetMapping("/dashboard")
    public String displayDashboardPage(Model model, Authentication authentication){
        model.addAttribute("username",authentication.getName());
        model.addAttribute("roles", authentication.getAuthorities().toString());

        return "dashboard";


    }
}
