package com.example.scheduler.medicalscheduler.repository;

import com.example.scheduler.medicalscheduler.model.UserDoctorMapModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDoctorMapRespository extends JpaRepository<UserDoctorMapModel,Integer> {
    
}