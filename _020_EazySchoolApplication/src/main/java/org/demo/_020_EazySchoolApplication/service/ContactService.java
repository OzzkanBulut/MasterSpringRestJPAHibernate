package org.demo._020_EazySchoolApplication.service;

import org.demo._020_EazySchoolApplication.model.Contact;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class ContactService {
    private static Logger logger = Logger.getLogger(ContactService.class.getName());

    public boolean saveMessageDetails(Contact contact){
        boolean isSaved = true;
        // TODO save to database later
        logger.info(contact.toString()+" is saved to db");
        return isSaved;
    }
}
