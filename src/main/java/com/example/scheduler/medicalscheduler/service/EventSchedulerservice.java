package com.example.scheduler.medicalscheduler.service;

import java.util.List;

import com.example.scheduler.medicalscheduler.model.EventSchedulermodel;

public interface EventSchedulerservice {
    public EventSchedulermodel schedule(EventSchedulermodel details);
    public List<EventSchedulermodel> getscheduledetails();
    //public EventSchedulermodel updateevent(String eventdate, EventSchedulermodel details);
    
}
