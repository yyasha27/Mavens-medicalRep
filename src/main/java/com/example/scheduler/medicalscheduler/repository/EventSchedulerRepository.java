package com.example.scheduler.medicalscheduler.repository;

import java.util.List;

import com.example.scheduler.medicalscheduler.model.EventSchedulermodel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventSchedulerRepository extends JpaRepository<EventSchedulermodel,String>{

    public List<EventSchedulermodel> findByEventdate(String eventdate);
    
}
