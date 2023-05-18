package com.hi.board.service;

import com.hi.board.domain.BoardDTO;
import com.hi.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardListService {

    @Autowired
    BoardMapper boardMapper ;

    public List<BoardDTO> getBoardlist(){

        return boardMapper.selectAll();

    }

}
