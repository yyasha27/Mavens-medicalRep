package com.example.scheduler.medicalscheduler.service;
import java.util.List;

import com.example.scheduler.medicalscheduler.model.Loginmodel;

public interface Loginservice {
    public Loginmodel entrydetails(Loginmodel details);
    public List<Loginmodel> getuserdetails();
}
