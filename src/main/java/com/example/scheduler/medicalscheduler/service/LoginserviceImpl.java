package com.example.scheduler.medicalscheduler.service;

import java.util.List;

import com.example.scheduler.medicalscheduler.model.Loginmodel;
import com.example.scheduler.medicalscheduler.repository.LoginRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginserviceImpl implements Loginservice {

    @Autowired
    private LoginRepository loginRepository;
    @Override
    public Loginmodel entrydetails(Loginmodel details){
        return loginRepository.save(details);
    }
    @Override
    public List<Loginmodel> getuserdetails() {
        return loginRepository.findAll();
    }
    
}
