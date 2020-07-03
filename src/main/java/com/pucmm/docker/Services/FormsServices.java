package com.pucmm.docker.Services;

import com.pucmm.docker.Entities.Form;
import com.pucmm.docker.Repositories.FormsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class FormsServices {
    @Autowired
    private FormsRepository formsRepository;

    @Transactional
    public Form saveForm(Form form) {
        formsRepository.save(form);
        return form;
    }
}
