package com.hi.board.controller;

import com.hi.board.domain.RequestModifyRequest;
import com.hi.board.service.BoardModifyService;
import com.hi.board.service.BoardReadService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@Log4j2
@RequestMapping("/board/modify")
public class BoardModfiyController {

    @Autowired
    private BoardReadService readService;

    @Autowired
    private BoardModifyService modifyService;

    @GetMapping
    public void getModifyForm(
            @RequestParam("bno") int bno,
            Model model
    ){
        log.info("GET | /board/modify/" + bno);

        model.addAttribute("board", readService.getBoardDTO(bno));
        // bno 전달 받고 View로 BoardDTO 객체 전달

    }

    @PostMapping
    public String modify(
            @RequestParam("bno") int bno,
            RequestModifyRequest modifyRequest,
            HttpServletRequest request
    ){

        log.info("POST | /board/modify/" + bno);
        // 사용자 입력한 BoardDTO Service 전달 -> update

        log.info(modifyRequest);

        modifyService.modfiyBoardDTO(modifyRequest, request);

        return "redirect:/board/list";
    }

}
