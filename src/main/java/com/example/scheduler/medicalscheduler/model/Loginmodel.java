package com.example.scheduler.medicalscheduler.model;

import javax.persistence.*;

@Entity
@Table(name ="userdetails")
public class Loginmodel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(nullable = false,unique = true)
    private String Email;
    @Column(nullable = false,unique = true)
    private String Username;
    @Column(nullable = false)
    private String Password;
    @Column(nullable = false)
    private String Name;
    public Loginmodel(){

    }
    public int getId() {
        return Id;
    }
    public void setId(int id) { 
        Id = id; 
    }
    public String getEmail() { 
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getUsername() {
        return Username;
    }
    public void setUsername(String username) {
        Username = username;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        Password = password;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }     
}
