package com.hi.board.service;

import com.hi.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardDeleteService {

    @Autowired
    private BoardMapper boardMapper;


    public int deleteBoard(int bno){

        return boardMapper.deleteBoard(bno);
    }

}
