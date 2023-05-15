package com.hi.app.domain;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@ToString
public class UserRequest {

    //변수 선언은 파라미터 이름과 동일 하게 선언
    private String keyword;
    private int tno;
    private int page;
    private LocalDate date;
}
