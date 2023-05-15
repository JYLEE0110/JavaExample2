package com.hi.app.controller;

import com.hi.app.domain.UserRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
@Log4j2
@RequestMapping("/date")
public class DateConverterController {

    @GetMapping
    public String getDateForm(){

        log.info("GET | /date");

        return "dateForm";
    }

    @PostMapping
    public String date(
            LocalDate date,
            UserRequest userRequest
    ){
        log.info("POST | /date");
        log.info("Date : " + date);

        log.info("Date : " + userRequest.getDate());

        return "date";
    }
}
