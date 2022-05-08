package com.example.scheduler.medicalscheduler.controller;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import com.example.scheduler.medicalscheduler.model.UserDoctorMapModel;
import com.example.scheduler.medicalscheduler.service.UserDoctorMapService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/map")
@CrossOrigin
public class UserDoctorMapController {

    ConcurrentMap<String, UserDoctorMapModel > userdoctormapmodelsMap =new ConcurrentHashMap<>();
    
    @Autowired
    private UserDoctorMapService userdoctorservice;

    //entry 
    @PostMapping("/mapdoctors")
    public String userdoctormapping (@RequestBody UserDoctorMapModel details){
        userdoctorservice.userdoctormapping(details);
        return "Mapped Successfully";
    }
    
    //display
    @GetMapping("/getmappingdetails")
    public List<UserDoctorMapModel> getmappingdetails(){
        return userdoctorservice.getmappingdetails();
    }
}
