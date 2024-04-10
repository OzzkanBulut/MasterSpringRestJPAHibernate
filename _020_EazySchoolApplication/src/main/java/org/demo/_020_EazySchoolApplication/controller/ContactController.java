package org.demo._020_EazySchoolApplication.controller;

import org.demo._020_EazySchoolApplication.model.Contact;
import org.demo._020_EazySchoolApplication.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.logging.Logger;

@Controller
public class ContactController {

    private Logger logger = Logger.getLogger(ContactController.class.getName());
    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/contact")
    public String displayContactPage() {
        return "contact";
    }

    //    @PostMapping("/saveMsg")
//    public ModelAndView saveMessage(@RequestParam String name, @RequestParam String mobileNum,
//                                    @RequestParam String email, @RequestParam String subject,
//                                    @RequestParam String message){
//        logger.info("Name: "+name);
//        logger.info("Mobile Number: "+mobileNum);
//        logger.info("E-mail: "+email);
//        logger.info("Subject: "+subject);
//        logger.info("Message: "+message);
//        return new ModelAndView("redirect:/contact");
//    }
    @PostMapping("/saveMsg")
    public ModelAndView saveMessage(Contact contact) {
        contactService.saveMessageDetails(contact);
        return new ModelAndView("redirect:/contact");
    }
}
