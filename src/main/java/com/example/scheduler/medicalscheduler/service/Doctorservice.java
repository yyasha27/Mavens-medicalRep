package com.example.scheduler.medicalscheduler.service;

import java.util.List;

import com.example.scheduler.medicalscheduler.model.Doctormodel;

public interface Doctorservice {
    public Doctormodel entrydoctor(Doctormodel entries);
    public List<Doctormodel> getalldoctordetails();
    public Doctormodel updateDoctormodel(String serial_number, Doctormodel doctormodel);
}
