package com.example.scheduler.medicalscheduler.repository;

import com.example.scheduler.medicalscheduler.model.Mappingmodel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MappingRepository extends JpaRepository<Mappingmodel,Integer> {
    
}
