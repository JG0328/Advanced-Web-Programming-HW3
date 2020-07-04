package com.pucmm.docker.Repositories;

import com.pucmm.docker.Entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUsersRepository extends JpaRepository<AppUser, Integer> {
    AppUser findByUsername(String username);
}
