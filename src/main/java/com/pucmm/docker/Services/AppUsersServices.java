package com.pucmm.docker.Services;

import com.pucmm.docker.Entities.AppRole;
import com.pucmm.docker.Entities.AppUser;
import com.pucmm.docker.Repositories.AppRolesRepository;
import com.pucmm.docker.Repositories.AppUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.HashSet;

@Service
public class AppUsersServices {
    @Autowired
    AppUsersRepository appUsersRepository;

    @Autowired
    AppRolesRepository appRolesRepository;

    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    @Transactional
    public void createUsers() {
        if (appUsersRepository.findByUsername("admin") == null) {
            appRolesRepository.save(new AppRole("ADMIN"));
            appRolesRepository.save(new AppRole("USER"));
            appUsersRepository.save(new AppUser(
                    "admin",
                    bCryptPasswordEncoder.encode("admin"),
                    true,
                    new HashSet<>(Arrays.asList(appRolesRepository.findByRole("ADMIN")))
            ));
            appUsersRepository.save(new AppUser(
                    "user",
                    bCryptPasswordEncoder.encode("password"),
                    true,
                    new HashSet<>(Arrays.asList(appRolesRepository.findByRole("USER")))
            ));
        }
    }
}
