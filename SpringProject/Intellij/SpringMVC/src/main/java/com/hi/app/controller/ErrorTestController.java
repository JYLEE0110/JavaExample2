package com.hi.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
public class ErrorTestController {

    @RequestMapping("/errorTest")
    public String getError(){

        log.info("GET | /errorTest");

        String str = null;

        str.toString();

        return "index";
    }

}
