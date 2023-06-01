package com.finsurge.task52.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Email {
    private String emailTo="< Your Mail Id >";
    private String emailSub="Task";
    private String emailmsg="Hiii This is Task 52";

    public String getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    public String getEmailSub() {
        return emailSub;
    }

    public void setEmailSub(String emailSub) {
        this.emailSub = emailSub;
    }

    public String getEmailmsg() {
        return emailmsg;
    }

    public void setEmailmsg(String emailmsg) {
        this.emailmsg = emailmsg;
    }
}

