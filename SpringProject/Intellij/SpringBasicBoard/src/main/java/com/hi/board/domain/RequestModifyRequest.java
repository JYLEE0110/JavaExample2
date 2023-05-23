package com.hi.board.domain;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class RequestModifyRequest {

    private int bno;
    private String title;
    private String content;
    // 회원제 게시판으로 변경에 따라 삭제
    // private String writer;
    private String oldfile;
    private MultipartFile file;
    private String filename;

}
