package org.demo._001_MyProject.controller;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.demo._001_MyProject.model.Contact;
import org.demo._001_MyProject.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ContactController {
    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/contact")
    public String displayPage(Model model) {
        model.addAttribute("contact", new Contact());
        return "/contact";
    }

    @PostMapping("/save")
    public String saveMessage(@Valid @ModelAttribute("contact") Contact contact, Errors errors) {
        if (errors.hasErrors()) {
            log.info("Validation is unsuccessfull due to: " + errors.toString());
            return "/contact";
        }
        contactService.saveMessage(contact);
        return "redirect:/contact";

    }
}
