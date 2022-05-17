package com.example.scheduler.medicalscheduler.model;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

@Table(name ="doctor_user_map")
public class UserDoctorMapModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @ManyToOne
    @JoinColumn(name="user_id",referencedColumnName = "serialnumber")
    private Loginmodel user;
    
    @ManyToOne
    @JoinColumn(name="doctor_id",referencedColumnName = "serial_number")
    private Doctormodel doctor;

    public Loginmodel getUser() {
        return user;
    }
    public void setUser(Loginmodel user) {
        this.user = user;
    }

    public Doctormodel getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctormodel doctor) {
        this.doctor = doctor;
    }
    
    public void save(UserDoctorMapModel userdoctormap){

    }
}
