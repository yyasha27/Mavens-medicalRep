package com.example.scheduler.medicalscheduler.model;

import javax.persistence.*;

@Entity
@Table(name ="userdetails")
public class Loginmodel {
    @Id
    @Column (nullable = false,unique = true)
    public String serial_number;
    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = false,unique = true)
    private String username;
    @Column(nullable = false)
    private String firstname;
    @Column(nullable = false)
    private String lastname;
    @Column(nullable = false)
    private String higher_institutename;
    @Column(nullable = false)
    private String higher_percentage;
    @Column(nullable = false)
    private String college_name;
    @Column(nullable = false)
    private String college_percentage;
    @Column(nullable = false)
    private String phonenumber;
    @Column(nullable = false)
    private String area;
    @Column(nullable = false)
    private String state;
    @Column(nullable = false)
    private String city ;
    @Column(nullable = false)
    private String languageknown;
    @Column(nullable = false)
    private String pincode;
    @Column(nullable = false)
    private String door_number;
    @Column(nullable = false)
    private String street;
    @Column(nullable = false)
    private String date_of_birth;
    @Column(nullable = false)
    private String Password;

    public Loginmodel(){
    }
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getCollege_name() {
        return college_name;
    }

    public void setCollege_name(String college_name) {
        this.college_name = college_name;
    }

    public String getCollege_percentage() {
        return college_percentage;
    }

    public void setCollege_percentage(String college_percentage) {
        this.college_percentage = college_percentage;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getDoor_number() {
        return door_number;
    }

    public void setDoor_number(String door_number) {
        this.door_number = door_number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getHigher_institutename() {
        return higher_institutename;
    }
    public void setHigher_institutename(String higher_institutename) {
        this.higher_institutename = higher_institutename;
    }
    public String getHigher_percentage() {
        return higher_percentage;
    }
    public void setHigher_percentage(String higher_percentage) {
        this.higher_percentage = higher_percentage;
    }
    public String getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        Password = password;
    }
    public String getLanguageknown() {
        return languageknown;
    }
    public void setLanguageknown(String languageknown) {
        this.languageknown = languageknown;
    }
    public String getDate_of_birth() {
        return date_of_birth;
    }
    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }
    public String getSerial_number() {
        return serial_number;
    }
    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

}
