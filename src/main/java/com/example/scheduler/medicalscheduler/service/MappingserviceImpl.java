package com.example.scheduler.medicalscheduler.service;

import java.util.List;

import com.example.scheduler.medicalscheduler.model.Mappingmodel;
import com.example.scheduler.medicalscheduler.repository.MappingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MappingserviceImpl implements Mappingservice{
    
    @Autowired
    private MappingRepository mappingRepository;

    @Override
    public Mappingmodel entrymappingdetails(Mappingmodel entries) {
        return mappingRepository.save(entries);
    }

    @Override
    public List<Mappingmodel> getallmappingdetails() {
        return mappingRepository.findAll();
    }

}
