package com.finsurge.task52.service;

import com.finsurge.task52.repository.EmailRepository;
import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.finsurge.task52.entity.Email;

@Service
public class EmailServiceClass implements EmailService {
    @Autowired
    private EmailRepository emailRepository;

    public void saveEmail()
    {
        emailRepository.save();
    }
    @Override
    public void sendMail() throws AddressException, MessagingException, IOException,AuthenticationFailedException {
        Email email=emailRepository.getEmail();
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new jakarta.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("< sender mail id >", "< mail password >");
            }
        });
        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress("< sender mail id >", false));

        String str=email.getEmailTo().trim();
        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(str));
        msg.setSubject(email.getEmailSub());
        String content=email.getEmailmsg();
        msg.setContent(content,"text/plain");
        msg.setSentDate(new Date());
        Transport.send(msg);
    }
}


