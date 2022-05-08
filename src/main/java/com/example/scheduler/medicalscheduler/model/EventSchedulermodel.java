package com.example.scheduler.medicalscheduler.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="eventscheduler")
public class EventSchedulermodel {
    @Id
    private String eventdate;
    private String user_id;
    private String doctor_id;
    private String speciality;
    
    private String status;
    public EventSchedulermodel() {
    }
    public String getUser_id() {
        return user_id;
    }
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    public String getDoctor_id() {
        return doctor_id;
    }
    public void setDoctor_id(String doctor_id) {
        this.doctor_id = doctor_id;
    }
    public String getSpeciality() {
        return speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    public String getEventdate() {
        return eventdate;
    }
    public void setEventdate(String eventdate) {
        this.eventdate = eventdate;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
