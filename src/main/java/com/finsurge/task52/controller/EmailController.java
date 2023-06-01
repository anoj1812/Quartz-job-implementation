package com.finsurge.task52.controller;

import com.finsurge.task52.service.EmailService;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.AddressException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;

@RestController
public class EmailController {
    @Autowired
    private EmailService emailService;
    @PostMapping(value = "/sendemail")
    public String sendEmail() throws AddressException, MessagingException, IOException {
        emailService.saveEmail();
        emailService.sendMail();
        return "Email sent " ;
    }
}


