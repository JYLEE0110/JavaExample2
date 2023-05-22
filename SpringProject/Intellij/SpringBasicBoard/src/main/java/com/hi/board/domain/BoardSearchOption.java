package com.hi.board.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class BoardSearchOption {

    private String searchType;
    private String keyword;

}
