package org.demo._020_EazySchoolApplication.controller;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.demo._020_EazySchoolApplication.model.Contact;
import org.demo._020_EazySchoolApplication.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.logging.Logger;

@Controller
@Slf4j
public class ContactController {


    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/contact")
    public String displayContactPage(Model model) {
        model.addAttribute("contact",new Contact());
        return "contact";
    }

    @PostMapping("/saveMsg")
    public String saveMessage(@Valid @ModelAttribute("contact") Contact contact, Errors errors) {
        if(errors.hasErrors()){
            log.error("Contact from validation failed due to :" +errors.toString());
            return "contact";
        }
        contactService.saveMessageDetails(contact);
        return"redirect:/contact";
    }
}
