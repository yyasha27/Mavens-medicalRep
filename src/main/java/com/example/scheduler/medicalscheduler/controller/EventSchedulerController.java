package com.example.scheduler.medicalscheduler.controller;

import java.util.List;

import com.example.scheduler.medicalscheduler.model.EventSchedulermodel;
import com.example.scheduler.medicalscheduler.repository.EventSchedulerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import  java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@RestController
@RequestMapping("/event")
public class EventSchedulerController {

    ConcurrentMap<String, EventSchedulermodel> eventschedulermodels =new ConcurrentHashMap<>();
    @Autowired
    EventSchedulerRepository repo;

    @GetMapping("/name")
    public ResponseEntity<List<EventSchedulermodel>> geteventbydate(@RequestParam String eventdate ){
        return new ResponseEntity<List<EventSchedulermodel>>(repo.findByEventDate(eventdate),HttpStatus.OK);
    }
}
