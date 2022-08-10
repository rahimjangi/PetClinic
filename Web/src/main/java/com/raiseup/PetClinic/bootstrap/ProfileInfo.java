package com.raiseup.PetClinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ProfileInfo {
    @Autowired
    private Environment environment;

    public String[] getActiveProfile(){
        return environment.getActiveProfiles();
    }

}
