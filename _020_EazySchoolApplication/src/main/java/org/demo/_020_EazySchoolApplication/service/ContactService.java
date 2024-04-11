package org.demo._020_EazySchoolApplication.service;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.demo._020_EazySchoolApplication.model.Contact;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.logging.Logger;

@Service
@Slf4j
//@SessionScope
@ApplicationScope
@Data
public class ContactService {

    private int counter = 0;

    public ContactService() {
        log.info("ContactService bean is created");
    }

    public boolean saveMessageDetails(Contact contact){
        boolean isSaved = true;
        // TODO save to database later
        log.info(contact.toString()+" is saved to db");
        return isSaved;
    }
}
