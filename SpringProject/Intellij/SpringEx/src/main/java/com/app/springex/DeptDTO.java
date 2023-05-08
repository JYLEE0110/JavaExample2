package com.app.springex;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DeptDTO {

    //@RequiredArgsConstructor 변수 앞에 Final을 붙이면 원하는 값만 생성자 생성 사용
//    private final int deptno;
    
    private int deptno;
    private String dname;
    private String loc;

    public static void main(String[] args) {

        //@AllArgsConstructor
        DeptDTO dept = new DeptDTO(2, "test", "loc");

        //@ToString
        System.out.println(dept);

        //@Setter
        dept.setDeptno(10);
        dept.setDname("ACCOUNTING");
        dept.setLoc("NEW YORK");

        //@Getter
        System.out.println(dept.getLoc());

        System.out.println(dept);

    }
}
