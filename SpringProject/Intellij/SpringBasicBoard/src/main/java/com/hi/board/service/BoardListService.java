package com.hi.board.service;

import com.hi.board.domain.BoardDTO;
import com.hi.board.domain.BoardListPage;
import com.hi.board.domain.BoardSearchOption;
import com.hi.board.domain.PageOption;
import com.hi.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardListService {

    @Autowired
    BoardMapper boardMapper ;

    private final int countPerpage = 5;

    public List<BoardDTO> getBoardlist(){

        return boardMapper.selectAll();

    }

    public BoardListPage getPage(int pageNum, BoardSearchOption searchOption){

        //현재 요청 페이지
        int requestPageNum = pageNum;

        PageOption pageOption = PageOption
                .builder()
                .searchOption(searchOption)
                .startNum((requestPageNum-1)*countPerpage)
                .count(countPerpage)
                .build();

        // 요청 페이지의 리스트 항목 : List<BoardDTO>
//        List<BoardDTO> list = boardMapper.selectList((requestPageNum-1)*countPerpage, countPerpage);
        List<BoardDTO> list = boardMapper.selectList(pageOption);
        int totalCount = boardMapper.selectTotalCount(searchOption);
        // 전체 게시글 개수를 알면 -> 전체 페이지의 개수를 구 할 수 있음 => 전체 게시글 개수 / 페이지당 게시물 수

        BoardListPage page = new BoardListPage(countPerpage, pageNum, list, totalCount);

        return page;
    }
}
