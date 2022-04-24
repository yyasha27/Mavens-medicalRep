package com.example.scheduler.medicalscheduler.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="eventscheduler")
public class EventSchedulermodel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int serial_id;
    @Column(nullable=false)
    private String user_id;
    @Column(nullable = false)
    private String doctor_id;
    @Column(nullable = false)
    private String speciality;
    @Column(nullable = false,unique=true)
    private String eventdate;
    @Column(nullable = false)
    private String status;
    public EventSchedulermodel() {
    }
    public int getSerial_id() {
        return serial_id;
    }
    public void setSerial_id(int serial_id) {
        this.serial_id = serial_id;
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
