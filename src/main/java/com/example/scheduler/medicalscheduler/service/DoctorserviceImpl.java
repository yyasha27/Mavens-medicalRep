package com.example.scheduler.medicalscheduler.service;

import java.util.List;

import com.example.scheduler.medicalscheduler.model.Doctormodel;
import com.example.scheduler.medicalscheduler.repository.DoctorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorserviceImpl implements Doctorservice{
    
    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public Doctormodel entrydoctor(Doctormodel entries) {
        return doctorRepository.save(entries);
    }

    @Override
    public List<Doctormodel> getalldoctordetails() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctormodel updateDoctormodel(String serial_number, Doctormodel doctormodel){
        return doctorRepository.save(doctormodel);
    }

}
