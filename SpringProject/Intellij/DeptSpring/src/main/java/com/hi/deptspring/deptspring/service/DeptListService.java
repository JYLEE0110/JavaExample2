package com.hi.deptspring.deptspring.service;

import com.hi.deptspring.deptspring.domain.DeptDTO;
import com.hi.deptspring.deptspring.domain.DeptSearchOption;
import com.hi.deptspring.deptspring.mapper.DeptMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class DeptListService {


    @Autowired
    private DeptMapper mapper;

    public List<DeptDTO> getList(){
        return mapper.selectAll();
    }

    // DeptSearchOption 을 받고 검색의 결과를 반환
    public List<DeptDTO> getSearchList(
            DeptSearchOption option
    ){
        return mapper.selectByOption(option);
    }

}
