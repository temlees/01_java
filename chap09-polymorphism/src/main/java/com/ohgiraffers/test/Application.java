package main.java.com.ohgiraffers.test;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
MemberService memberService;
MemberDTO memberDTO = new MemberDTO();
SnsAuth auth;

while(true){
    System.out.println("로그인 프로그램");
    System.out.println("로그인할 sns를 고르시오 1. Google, 2. Naver,  3.Kakao");
    int choice = sc.nextInt();
    sc.nextLine();
    System.out.println("아이디");
    memberDTO.setId(sc.nextLine());
    System.out.println("비밀번호");
    memberDTO.setPwd(sc.nextLine());

    boolean result = true;

    switch (choice) {
        case 1:
            memberService = new MemberService(new GoogleAuth());
            result = memberService.findMember(memberDTO);
            if (result) {
                System.out.println("goole로그인에 성공하였습니다. " + memberDTO.getId());
                return;
            }
            break;
        case 2:
            memberService = new MemberService(new NaverAuth());
            result = memberService.findMember(memberDTO);
            if (result) {
                System.out.println("naver로그인에 성공하였습니다. " + memberDTO.getId());
                return;
            }
            break;
        case 3:
            memberService = new MemberService(new KakaoAuth());
            result = memberService.findMember(memberDTO);
            if (result) {
                System.out.println("kakao 로그인에 성공하였습니다.. " + memberDTO.getId());
                return;
            }
            break;
        case 9:
            System.out.println("로그인을 종료합니다.");
            return;
    }
}






    }//main
}//class
