package com.example.scheduler.medicalscheduler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import  java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import com.example.scheduler.medicalscheduler.model.Mappingmodel;
import com.example.scheduler.medicalscheduler.service.Mappingservice;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/mapping")
@CrossOrigin
public class MappingController {
    ConcurrentMap<Integer, Mappingmodel> mappingmodels = new  ConcurrentHashMap<>();

    @Autowired
    private Mappingservice mappingservice;

    @PostMapping("/mappingdoctors")
    public String entrymappingdetails(@RequestBody Mappingmodel details){
        mappingservice.entrymappingdetails(details);
        return "Mapped Successfully";
    }

    @GetMapping("/getmapdetails")
    public List<Mappingmodel> getallmappingdetails() {
        return mappingservice.getallmappingdetails();
    }
    
}
