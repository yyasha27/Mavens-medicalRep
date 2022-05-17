package com.example.scheduler.medicalscheduler.model;

import javax.persistence.*;

@Entity
@Table(name ="userdetails")
public class Loginmodel {
    @Id
    @Column (nullable = false,unique = true)
    public String serialnumber;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String username;
    private String firstname;
    private String lastname;
    private String higher_institutename;
    private String higher_percentage;
    private String college_name;
    private String college_percentage;
    private String phonenumber;
    private String area;
    private String state;
    private String city ;
    private String languageknown;
    private String pincode;
    private String door_number;
    private String street;
    private String date_of_birth;
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
    public String getSerialnumber() {
        return serialnumber;
    }
    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

}
