package com.pucmm.docker;

import com.pucmm.docker.Services.AppUsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class AppInitializator {
    @Autowired
    AppUsersServices appUsersServices;

    @PostConstruct
    private void initConfig() {
        appUsersServices.createUsers(); // Creating admin and access user
    }
}
