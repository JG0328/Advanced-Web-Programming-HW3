package com.pucmm.docker.Repositories;

import com.pucmm.docker.Entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRolesRepository extends JpaRepository<AppRole, String> {
    public AppRole findByRole(String role);
}
