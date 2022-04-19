package com.example.scheduler.medicalscheduler.service;

import java.util.List;

import com.example.scheduler.medicalscheduler.model.UserDoctorMapModel;
import com.example.scheduler.medicalscheduler.repository.UserDoctorMapRespository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDoctorMapServiceImpl implements UserDoctorMapService {

    @Autowired
    private UserDoctorMapRespository userdoctormapRepository;
    
    @Override
    public UserDoctorMapModel userdoctormapping (UserDoctorMapModel details){
        return userdoctormapRepository.save(details);
    }
    
    @Override
    public List<UserDoctorMapModel> getmappingdetails() {
        return userdoctormapRepository.findAll();
    }
}

