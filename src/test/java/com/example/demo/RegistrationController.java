package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registrations")
public class RegistrationController {
    private final RegistrationServer registrationserver;

    public RegistrationController(RegistrationServer registrationserver) {
        this.registrationserver = registrationserver;
    }

    @GetMapping
    public List<Registration> getAllRegistrations() {
        return registrationserver.getRegistrations();
    }

    @PostMapping
    public Registration addRegistration(@RequestBody Registration registration) {
        return registrationserver.addRegistration(registration);
    }
}