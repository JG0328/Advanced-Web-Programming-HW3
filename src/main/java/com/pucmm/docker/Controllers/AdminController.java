package com.pucmm.docker.Controllers;

import com.pucmm.docker.Repositories.FormsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/admin")
public class AdminController {
    @Autowired
    FormsRepository formsRepository;

    @RequestMapping(path = "", method = RequestMethod.GET)
    public ModelAndView indexAdmin() {
        ModelAndView model = new ModelAndView();

        model.addObject("first", formsRepository.sumFirst());
        model.addObject("second", formsRepository.sumSecond());
        model.addObject("third", formsRepository.sumThird());

        model.setViewName("admin");
        return model;
    }
}
