package com.example.scheduler.medicalscheduler.service;

import java.util.List;

import com.example.scheduler.medicalscheduler.model.Mappingmodel;

public interface Mappingservice {
    public Mappingmodel entrymappingdetails(Mappingmodel entries);
    public List<Mappingmodel> getallmappingdetails();
    
}
