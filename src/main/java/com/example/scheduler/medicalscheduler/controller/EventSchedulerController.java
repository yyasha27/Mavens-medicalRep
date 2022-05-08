package com.example.scheduler.medicalscheduler.controller;

import java.util.List;

import com.example.scheduler.medicalscheduler.model.EventSchedulermodel;
import com.example.scheduler.medicalscheduler.repository.EventSchedulerRepository;
import com.example.scheduler.medicalscheduler.service.EventSchedulerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import  java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@RestController
@RequestMapping("/event")
@CrossOrigin
public class EventSchedulerController {

    ConcurrentMap<String, EventSchedulermodel> eventschedulermodels =new ConcurrentHashMap<>();
    @Autowired
    EventSchedulerRepository repo;

    @Autowired
    private EventSchedulerservice eventservice;

    @PostMapping("/eventdetails")
    public String schedule(@RequestBody EventSchedulermodel details){
        eventservice.schedule(details);
        return "Scheduled";
    }

    @GetMapping("/geteventdetails")
    public List<EventSchedulermodel> getscheduledetails(){
        return eventservice.getscheduledetails();
    }

    @GetMapping("/name")
    public ResponseEntity<List<EventSchedulermodel>> geteventbydate(@RequestParam String eventdate ){
        return new ResponseEntity<List<EventSchedulermodel>>(repo.findByEventdate(eventdate),HttpStatus.OK);
    }

    /*@RequestMapping(value="/eventdate/{eventdate}", method=RequestMethod.PUT)
    public EventSchedulermodel updateevent(@PathVariable String eventdate, @RequestBody EventSchedulermodel details) {
        return eventservice.updateevent(eventdate,details);
    }*/

}
