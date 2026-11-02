package com.example.demo;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;
@Service
public class RegistrationServer {
    private List<Registration> registrations=new ArrayList<>();
    public List<Registration> getRegistrations() {
        return registrations;
    }
    public Registration addRegistration(Registration registration){
        registrations.add(registration);
        return registration;
    }// Server implementation for handling registration logic
}