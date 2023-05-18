package com.hi.deptspring.deptspring.controller.rest;

import com.hi.deptspring.deptspring.domain.DeptDTO;
import com.hi.deptspring.deptspring.domain.DeptRegistRequest;
import com.hi.deptspring.deptspring.service.*;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // @ResponseBody 생략가능
@RequestMapping("/api/v1/depts")
@Log4j2
public class DeptRestController {

    // Get : 전체 리스트
    // Get /{no} : 부서번호로 한개의 부서 정보
    // Post : JSON 형식의 데이터를 받아서 데이터베이스에 저장
    // Put /{no} : 하나의 부서 정보를 수정, 행 전체 데이터를 수정
    // Delete /{no} : 부서 정보 하나를 삭제

    @Autowired
    private DeptListService listService;

    @Autowired
    private DeptReadService readService;

    @Autowired
    private DeptRegistService registService;

    @Autowired
    private DeptModifyService modifyService;

    @Autowired
    private DeptDeleteService deleteService;

    @GetMapping // /api/vi/depts
    public ResponseEntity<List<DeptDTO>> getDeptList(){

        // ResponseEntity<T> => 응답 데이터를 제네릭으로 정의
        // Body(응답 데이터), HttpHeader, StatusCode
        // Header 정의 => HttpHeaders
        // new ResponseEntity<>(Body(응답데이터), httpHeader, StatusCode)
        log.info("GET | /api/v1/depts");

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Some-header", "some-value");

        ResponseEntity<List<DeptDTO>> entity = new ResponseEntity<>(listService.getList(),httpHeaders, HttpStatus.OK);

        return entity;
    }

    @GetMapping("/{no}")
    public  ResponseEntity<DeptDTO> getDept(
            @PathVariable("no") int deptno
    ){
        log.info("GET | /api/v1/depts/" + deptno);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Some-header", "some-value");

        return new ResponseEntity<>(readService.getDept(deptno),httpHeaders, HttpStatus.OK);
    }

    @PostMapping// /api/v1/depts
    public String regDept(
            @RequestBody DeptRegistRequest registRequest
            ){
        // JSON 데이터를 JAVA 객체로 받는다. => @RequestBody

        log.info("POST | /api/v1/depts");
        log.info("JSON -> DeptregistRequest : " + registRequest);

        registService.registDept(registRequest);

        return "insert OK!";
    }

    @PutMapping("/{no}")
    public String edit(
            @PathVariable("no") int deptno,
            @RequestBody DeptDTO dto
    ){
        log.info("PUT | /api/v1/depts/" + deptno);
//        dto.setDeptno(deptno);
        log.info("JSON -> DeptDTO : " + dto);

        modifyService.modifyDept(dto);

        return "update ok";
    }

    @DeleteMapping("/{no}")
    public String delete(
            @PathVariable("no") int deptno
    ){
        log.info("Delete | /api/v1/depts/" + deptno);

        deleteService.deleteDept(deptno);

        return "delete ok";
    }
}
