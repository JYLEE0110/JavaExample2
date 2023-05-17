package com.hi.deptspring.deptspring.domain;

import lombok.*;
import org.apache.ibatis.annotations.Mapper;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
//@RequiredArgsConstructor
public class DeptDTO {

    private int deptno;
    private String dname;
    private String loc;

}
