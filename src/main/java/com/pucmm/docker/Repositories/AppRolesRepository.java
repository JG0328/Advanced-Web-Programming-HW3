package com.pucmm.docker.Repositories;

import com.pucmm.docker.Entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRolesRepository extends JpaRepository<AppRole, String> {

}
