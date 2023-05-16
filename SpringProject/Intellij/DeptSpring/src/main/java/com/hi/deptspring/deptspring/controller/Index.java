package com.hi.deptspring.deptspring.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class Index {

    @GetMapping("/index")
    public void getIndex(){

        log.info("GET | /index");

    }

}
