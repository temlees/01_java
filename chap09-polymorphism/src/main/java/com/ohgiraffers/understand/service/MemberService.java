package main.java.com.ohgiraffers.understand.service;

import main.java.com.ohgiraffers.understand.auth.SnsAuth;
import main.java.com.ohgiraffers.understand.auth.impl.GoogleAuth;
import main.java.com.ohgiraffers.understand.auth.impl.KakaoAuth;
import main.java.com.ohgiraffers.understand.auth.impl.NaverAuth;
import main.java.com.ohgiraffers.understand.dto.MemberDTO;

import java.util.Scanner;

public class MemberService {
    MemberDTO memberDTO = new MemberDTO();

    public void login(int no){
    Scanner sc = new Scanner(System.in);

        if(no ==1){
            SnsAuth google = new GoogleAuth();
            google.loging();
        } else if (no==2) {
            SnsAuth kakao = new KakaoAuth();
            kakao.loging();
        }else if (no==3) {
            SnsAuth naver  = new NaverAuth();
            naver.loging();
        }else System.out.println("다른 sns로그인 방식이 없습니다");

    }//login

    public void signUp(){
        Scanner sc = new Scanner(System.in);
        System.out.println("회원가입 할 아이디 입력 :");
        String id = sc.nextLine();
        System.out.println("회원가입 할 비밀번호 입력 :");
        String pwd = sc.nextLine();



    }

}//class
