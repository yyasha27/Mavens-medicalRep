package com.example.scheduler.medicalscheduler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import  java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import com.example.scheduler.medicalscheduler.model.Doctormodel;
import com.example.scheduler.medicalscheduler.service.Doctorservice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/doctor")
@CrossOrigin
public class DoctorController {
    ConcurrentMap<String, Doctormodel> doctormodels =new ConcurrentHashMap<>();

    @Autowired
    private Doctorservice doctorservice;

    @PostMapping("/docdetails")
    public String entrydoctor(@RequestBody Doctormodel entries){
        doctorservice.entrydoctor(entries);
        return "Doctor details Added";
    }

    @GetMapping("/getdoctordetails")
    public List<Doctormodel> getalldoctordetails(){
        return doctorservice.getalldoctordetails();
    }

    @RequestMapping(value="/doctordetails/{serialNumber}", method=RequestMethod.PUT)
    public Doctormodel updateDoctormodel(@PathVariable String serialNumber, @RequestBody Doctormodel doctormodel) {
        return doctorservice.updateDoctormodel(serialNumber,doctormodel);
    }


}
