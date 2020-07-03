package com.pucmm.docker.Repositories;

import com.pucmm.docker.Entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUsersRepository extends JpaRepository<AppUser, Long> {
    AppUser findByName(String name);

    AppUser findByUsername(String username);
}
