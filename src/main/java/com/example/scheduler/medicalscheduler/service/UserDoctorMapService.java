package com.example.scheduler.medicalscheduler.service;

import java.util.List;

import com.example.scheduler.medicalscheduler.model.UserDoctorMapModel;

public interface UserDoctorMapService {
    public UserDoctorMapModel userdoctormapping(UserDoctorMapModel details);
    public List<UserDoctorMapModel> getmappingdetails();
}
