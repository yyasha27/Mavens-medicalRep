package com.example.scheduler.medicalscheduler.repository;

import com.example.scheduler.medicalscheduler.model.Loginmodel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Loginmodel,Integer> {
    
}
