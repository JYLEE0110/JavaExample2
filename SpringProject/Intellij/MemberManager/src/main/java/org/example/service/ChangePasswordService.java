package org.example.service;

import org.example.dao.Dao;
import org.example.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;

public class ChangePasswordService {


    private Dao dao;

    public ChangePasswordService(Dao dao) {
        this.dao = dao;
    }

    // 이메일, 현재비밀번호, 새로운 비밀번호 => 데이터 변경

    public void changePassword(String email, String oldPw, String newPw){
        // 1. 이메일로 저장된 회원 정보가 있는지 판단 => selectByEmail()
        Member member = dao.selectByEmail(email);
        if(member == null){
            // 존재하지않는 회원
            System.out.println("존재하지 않는 회원정보입니다.");
            return;
        }
        
        // 비밀번호를 변경 처리
        member.changePassword(oldPw, newPw);
        dao.update(member);


    }

}
