package com.hi.deptspring.deptspring.controller.rest;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Log4j2
@RequestMapping("/mc/simple")
public class SimpleConverterController {

    @GetMapping
    public void form(){
        log.info("GET | /mc/simple ... Form");
    }

    @PostMapping
    @ResponseBody // view 반환이아닌 JSON형식의 데이터를 반환
    public String simple(
            @RequestBody String body
    ){

        log.info("POST | /mc/simple");
        log.info("body >>>> " + body);

        return "body >>>>>";
    }

}
