package com.pucmm.docker.Repositories;

import com.pucmm.docker.Entities.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FormsRepository extends JpaRepository<Form, Long> {
    @Query(value = "select sum(first) from Form ")
    int sumFirst();

    @Query(value = "select sum(second) from Form ")
    int sumSecond();

    @Query(value = "select sum(third) from Form ")
    int sumThird();
}
