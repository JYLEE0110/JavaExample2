package com.hi.deptspring.deptspring.service;

import com.hi.deptspring.deptspring.domain.DeptDTO;
import com.hi.deptspring.deptspring.mapper.DeptMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class DeptModifyService {

    @Autowired
    private DeptMapper mapper;

    public int modifyDept(
            DeptDTO dto
    ){
        return mapper.updateDept(dto);
    }

}
