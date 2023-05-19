package com.hi.board.mapper;

import com.hi.board.domain.BoardDTO;
import com.hi.board.domain.RequestModifyRequest;
import com.hi.board.domain.RequestRegBoard;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {


    List<BoardDTO> selectAll();

    BoardDTO selectByBno(int bno);

    int insertBoard(RequestRegBoard regBoard);

    int updateBoard(RequestModifyRequest modifyRequest);

    int deleteBoard(int bno);

}
