package com.hi.board.controller;

import com.hi.board.service.BoardDeleteService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Log4j2

public class BoardDeleteController {

    @Autowired
    BoardDeleteService deleteService;

    @RequestMapping("/board/delete")
    public String deleteBoard(
            @RequestParam("bno") int bno
    ) {

        log.info("POST | /board/delete/" + bno);

        deleteService.deleteBoard(bno);

        return "redirect:/board/list";
    }

}
