package com.pucmm.docker.Repositories;

import com.pucmm.docker.Entities.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormsRepository extends JpaRepository<Form, Long> {
}
