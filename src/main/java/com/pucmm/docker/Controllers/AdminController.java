package com.pucmm.docker.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/admin")
public class AdminController {
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public ModelAndView indexAdmin() {
        ModelAndView model = new ModelAndView();
        model.setViewName("admin");
        return model;
    }
}
