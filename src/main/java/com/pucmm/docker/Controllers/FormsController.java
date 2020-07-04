package com.pucmm.docker.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/barcamp")
public class FormsController {
    @GetMapping
    @ResponseBody
    public String test() {
        return "Hello World";
    }
}
