package com.sarakana.demo.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class FunController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;
    

    @GetMapping("")
    public String hello() {
        return new String("Hello World!");
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return new String("Run hard 5km!");
    }

    @GetMapping("/fortune")
    public String getFortune() {
        return new String("Today is not your lucky day!");
    }

    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return new String("Coach: " + coachName + ", Team Name: " + teamName);
    }
    
}
