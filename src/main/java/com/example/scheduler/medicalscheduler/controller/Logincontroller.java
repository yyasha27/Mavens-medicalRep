package com.example.scheduler.medicalscheduler.controller;

import com.example.scheduler.medicalscheduler.model.Loginmodel;
import com.example.scheduler.medicalscheduler.service.Loginservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import  java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;


@RestController
@RequestMapping("/login")
@CrossOrigin
public class Logincontroller {
    
    ConcurrentMap<String, Loginmodel> loginmodels =new ConcurrentHashMap<>();
    @Autowired
    private Loginservice loginservice;

    @PostMapping("/register")
    public String entrydetails(@RequestBody Loginmodel details){
        loginservice.entrydetails(details);
        return "Resgistered Successfully";
    }
    
    @GetMapping("/getuserdetails")
    public List<Loginmodel> getuserdetails(){
        return loginservice.getuserdetails();
    }
}
