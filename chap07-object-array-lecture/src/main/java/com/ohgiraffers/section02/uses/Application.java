package main.java.com.ohgiraffers.section02.uses;

import java.util.Scanner;

public class Application { //프로그램 실행여부
    public static void main(String[] args) {

        /*
        *  여러명의 회원 정보를 한번에 등록
        *  전체 회원 조회시 여러명의 회원 정보를 한번에 반환
        *
        * MemberRepository - static 필드로 회원 정보들을 저장(최대 10명)
        *
        * */

        //사용자의 입력 받기 위한
        Scanner sc = new Scanner(System.in);
        //객체를 heap 에 생성해 메소드 실행할 준비
        MemberService memberService = new MemberService();

        loop: while(true){
            System.out.println("===회원관리 프로그램====");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴 선택");
            int no = sc.nextInt();

           switch(no){
                case 1:memberService.signUpMembers(); break;
                case 2: memberService.showAllMembers(); break;
                case 9:
                    System.out.println("프로그램을 종료합니다"); break loop;
                    default:
                        System.out.println("잘못된 번호입니다"); break;

            }
        }
    }
}
