package com.example.scheduler.medicalscheduler.model;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctordetails")
public class Doctormodel {
    @Id
    @Column(nullable= false, unique = true)
    private String serial_number;
    private String doctorname;
    private String speciality;
    private String workspace;
    private String area;
    private String city;
    private String state;
    private String pincode;
    private String status;
    private String street_name;

    public Doctormodel() {
    }

    public String getPincode() {
        return pincode;
    }
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStreet_name() {
        return street_name;
    }
    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }
   
    public String getDoctorname() {
        return doctorname;
    }
    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }
    public String getSerial_number() {
        return serial_number;
    }
    
    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }
    public String getSpeciality() {
        return speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    public String getWorkspace() {
        return workspace;
    }
    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    
}
