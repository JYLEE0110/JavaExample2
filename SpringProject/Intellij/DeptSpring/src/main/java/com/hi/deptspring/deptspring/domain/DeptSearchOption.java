package com.hi.deptspring.deptspring.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Builder
public class DeptSearchOption {

    private String searchType;
    private String keyword;

}
