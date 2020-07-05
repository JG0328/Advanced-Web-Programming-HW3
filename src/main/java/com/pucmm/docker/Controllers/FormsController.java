package com.pucmm.docker.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/")
public class FormsController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView indexClients() {
        ModelAndView model = new ModelAndView();
        model.addObject("clients", "");
        model.setViewName("form");
        return model;
    }

}


