package main.java.com.ohgiraffers.understand.auth.impl;

import main.java.com.ohgiraffers.understand.auth.SnsAuth;
import main.java.com.ohgiraffers.understand.dto.MemberDTO;

import java.util.Scanner;

public class GoogleAuth implements SnsAuth {
 private final static MemberDTO [] members = new MemberDTO[10];
 MemberDTO memberDTO = new MemberDTO();

 private static int count;

 Scanner sc = new Scanner(System.in);


    @Override
    public void loging() {
        memberDTO.setID("이진우");
        memberDTO.setPwd("1234");

        System.out.println("아이디 입력 :");
        String id = sc.nextLine();
        System.out.println("비밀번호 입력");
        String pwd = sc.nextLine();
        
        if (memberDTO.getID().equals(id)&&memberDTO.getPwd().equals(pwd)) {
            System.out.println("google에 인증된"+memberDTO.getID()+"님 환영합니다");
        }else {
            System.out.println("google에 인증된 회원이 없습니다");
        }





    }

}
