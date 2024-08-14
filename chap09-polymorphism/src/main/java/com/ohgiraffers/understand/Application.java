package main.java.com.ohgiraffers.understand;

import main.java.com.ohgiraffers.understand.service.MemberService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MemberService memberService = new MemberService();

     lopp:   while (true) {
            System.out.println("사용자 로그인 프로그램");
            System.out.println("1. google로 로그인");
            System.out.println("2. kakao로 로그인");
            System.out.println("3. naver로 로그인");
            System.out.println("4. 회원가입");
            System.out.println("5. 종료");

            int no = sc.nextInt();

            switch (no) {
                case 1: memberService.login(no); break;
                case 2: memberService.login(no); break;
                case 3: memberService.login(no); break;
                case 4: memberService.signUp(); break;


            }
            
        }

    }//main
}//class
