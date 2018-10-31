package com.example.springBootDemo.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Job1 {
    private int count;
    @Scheduled(cron = "*/3 * * * * ?")
    private void process(){
        System.out.println("this is job running " + (count++) + new Date());
    }
}
