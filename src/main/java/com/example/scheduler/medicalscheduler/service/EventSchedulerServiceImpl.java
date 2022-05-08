package com.example.scheduler.medicalscheduler.service;


import java.util.List;

import com.example.scheduler.medicalscheduler.model.EventSchedulermodel;
import com.example.scheduler.medicalscheduler.repository.EventSchedulerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventSchedulerServiceImpl implements EventSchedulerservice{
    
    @Autowired
    private EventSchedulerRepository repo;

    @Override
    public EventSchedulermodel schedule(EventSchedulermodel entries) {
        return repo.save(entries);
    }

    @Override
    public List<EventSchedulermodel> getscheduledetails() {
        return repo.findAll();
    }
    
    //@Override
    //public EventSchedulermodel updateevent(String eventdate, EventSchedulermodel details){
     //   return repo.save(details);
    //}
    

    
    
}
