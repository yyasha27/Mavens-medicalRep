package com.example.scheduler.medicalscheduler.model;

import javax.persistence.*;

@Entity
@Table(name ="mappingdetails")
public class Mappingmodel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (nullable = false,unique = true)
    public int serialnumber;
    private String user_id;
    private String doctor_id;
    private String doctor_name;
    
    public Mappingmodel(){
    }
    
    public int getSerialnumber() {
        return serialnumber;
    }
    public void setSerialnumber(int serialnumber) {
        this.serialnumber = serialnumber;
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
    public String getDoctor_name() {
        return doctor_name;
    }
    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }   

}
