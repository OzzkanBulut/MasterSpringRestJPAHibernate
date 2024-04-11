package org.demo._001_MyProject.model;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Contact {
    @NotBlank(message = "Name can not be blank!")
    @Size(min = 3,message = "Name must be longer than 3 characters!")
    private String name;
    @Size(min = 10,max = 10,message = "Phone number must be 10 digits")
    private String mobileNum;
    @Email(message = "Email must be a valid format!")
    private String email;
    @NotBlank(message = "Subject must be not empty!")
    @Size(min = 5,message = "Subject must be longer than 5 characters!")
    private String subject;
    @NotBlank(message = "Message must be not empty!")
    @Size(min = 10,message = "Message must be longer than 10 characters!")
    private String message;
}
