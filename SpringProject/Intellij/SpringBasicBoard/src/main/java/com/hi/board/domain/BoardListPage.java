package com.hi.board.domain;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
public class BoardListPage {

    // 페이지 당 출력할 게시물의 개수
    private int countPerPage;

    // 현재 페이지 번호
    private int pageNum;
    // 게시물의 리스트 List<BoardDTO> :
    private List<BoardDTO> list;

    // 전체 게시물의 개수
    private int totalCount;

    // 페이징 시작 번호
    private int startNum;

    // 페이징 끝 번호
    private int endNum;


    // 이전 버튼 출력 유무
    private boolean prev;

    // 다음 버튼 출력 유무
    private boolean next;

    public BoardListPage(int countPerPage, int pageNum, List<BoardDTO> list, int totalCount) {
        this.countPerPage = countPerPage;
        this.pageNum = pageNum;
        this.list = list;
        this.totalCount = totalCount;

        calPageInfo();
    }

    private void calPageInfo(){
        // 끝 번호
        endNum = (int)(Math.ceil((pageNum*1.0/10)))*10; // 올림 처리
        // ex) pageNum = 1.1 => 2*10 => 20
        // ex) pageNum = 0.9 => 1*10 => 10

        // 1 ~ 10 => 10
        // 11 ~ 20 => 20
        // 21 ~ 30 => 30
        // 31 ~40 => 40
        // 41 ~50 => 50

        // 시작 번호
        startNum = endNum-9;
        // 1 ~ 10 => 10 - 9 => 1
        // 11 ~ 20 => 20 - 9 => 11
        // 21 ~ 30 => 30 - 9 => 21
        // 31 ~40 => 40 - 9 => 31
        // 41 ~50 => 50 - 9 => 41

        // 실제 끝 번호 : 전체 페이지의 끝 번호
        int realEndNum = (int)(Math.ceil(totalCount * 1.0 / countPerPage));
        // ex) totalCount = 57 / countPerPage = 5 => 57.0 / 5 => 11.4 => 12

        // endNum
        endNum = realEndNum < endNum ? realEndNum : endNum;

        // 이전 유무
        // ex) 5 => 5-9 => -4 x
        // ex) 16 => 16-9 => 7 o
        prev = startNum > 1;

        // 다음 유무 : 현재 구간의 마지막 번호 < realEndNum
        next = endNum < realEndNum;
    }

}
