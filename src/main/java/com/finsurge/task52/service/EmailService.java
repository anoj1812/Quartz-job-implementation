package com.finsurge.task52.service;

import jakarta.mail.AuthenticationFailedException;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.AddressException;
import java.io.IOException;

public interface EmailService  {

    public void saveEmail();
    public void sendMail() throws AddressException, MessagingException, IOException, AuthenticationFailedException;
}


