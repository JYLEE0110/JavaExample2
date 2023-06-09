package org.example.main;

import org.example.assembler.Assembler;
import org.example.dao.MemberDao;
import org.example.domain.RegisterRequest;
import org.example.service.ChangePasswordService;
import org.example.service.MemberRegisterService;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MemberManagerMain {

    // 조립기 : 객체를 관리(생성, 주입, 제공...)
    static Assembler assembler = new Assembler();


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        // 사용자 메뉴 입력
        while (true) {
            // 한줄 단위로 명령어 구분
            // exit : 프로그램 종료
            System.out.println("명령어를 입력해주세요");
            String command = scan.nextLine();

            if (command.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            } else if (command.startsWith("new ")) {
                // new 이메일 비번 비번학인 이름
                // new cool@gmail 1111 1111 COOL
                String[] commandStr = command.split(" ");

                // 입력요청
                newCommand(commandStr);

            } else if (command.startsWith("change ")) {
                // change 이메일 oldPW newPw
                String[] commandStr = command.split(" ");
                changeCommand(commandStr);
            }
        }


        //입력 메소드
    }

    static void newCommand(String[] args) {

        // 전달 받은 배열의 사이즈가 : 5
        if (args.length != 5) {
            System.out.println("new 명령 구문이 올바르지 않습니다. 다시시도해 주세요.");
            return;
        }

        MemberRegisterService registerService = assembler.getRegisterService();
        // new cool@gmail 1111 1111 COOL
        // [0]     [1]    [2]  [3]  [4]
        RegisterRequest request = new RegisterRequest();
        request.setEmail(args[1]);
        request.setPassword(args[2]);
        request.setConfirmPassword(args[3]);
        request.setName(args[4]);

        //비밀번호 일치 여부
        if (!request.isConfirmPassword()) {
            System.out.println("비밀번호와 확인 비밀번호가 일치하지않습니다. 다시 입력해 주세요.");
            return;
        }
        registerService.regist(request);
    }

    //변경 메소드
    static void changeCommand(String[] args) {
        // change 이메일 oldPW newPw = > 4개
        //  [0]    [1]   [2]   [3]
        if(args.length != 4){
            System.out.println("change 명령구문이 옳바르지 않습니다. 다시 시도해 주세요.");
            return;
        }

        ChangePasswordService passwordService = assembler.getPasswordService();

        passwordService.changePassword(args[1], args[2], args[3]);
    }
}
