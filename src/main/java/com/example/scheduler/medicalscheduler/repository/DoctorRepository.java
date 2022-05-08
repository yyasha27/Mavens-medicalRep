package com.example.scheduler.medicalscheduler.repository;


import com.example.scheduler.medicalscheduler.model.Doctormodel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctormodel,String> {
}