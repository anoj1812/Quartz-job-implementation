package com.finsurge.task52.scheduler;

import com.finsurge.task52.service.EmailService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;

public class SimpleJob implements Job{
    @Autowired
    private EmailService emailService;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) {
        emailService.saveEmail();
        try{
            emailService.sendMail();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Email Sent");

    }
}
