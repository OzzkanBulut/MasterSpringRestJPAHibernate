package org.demo._001_MyProject.service;

import lombok.extern.slf4j.Slf4j;
import org.demo._001_MyProject.model.Contact;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ContactService {

    public void saveMessage(Contact contact){
      log.info(contact.toString()+" is saved to DB!");
    }
}
