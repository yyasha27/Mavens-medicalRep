package com.example.scheduler.medicalscheduler.controller;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import com.example.scheduler.medicalscheduler.model.UserDoctorMapModel;
import com.example.scheduler.medicalscheduler.service.UserDoctorMapService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;


@RestController
@RequestMapping("/map")
public class UserDoctorMapController {

    ConcurrentMap<String, UserDoctorMapModel > userdoctormapmodelsMap =new ConcurrentHashMap<>();
    @Autowired
    private UserDoctorMapService userdoctorservice;

    @PostMapping("/mapdoctors")
    public String userdoctormapping (@RequestBody UserDoctorMapModel details){
        userdoctorservice.userdoctormapping(details);
        return "Mapped Successfully";
    }
    
    @GetMapping("/getmappingdetails")
    public List<UserDoctorMapModel> getmappingdetails(){
        return userdoctorservice.getmappingdetails();
    }
}
