package main.java.com.ohgiraffers.question;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LoginService loginService = new LoginService();

        loop:
        while (true) {
            System.out.println("----화원가입 및 로그인 시스템----");
            System.out.println("1. 회원가입 프로그램 :");
            System.out.println("2. 로그인 프로그램");
            System.out.println("3. 프로그램 종료");
            System.out.println("메뉴선택");

            int no = sc.nextInt();

            switch (no) {
                case 1:
                    loginService.signup();
                    break;
                case 2:
                    loginService.login();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다");
                    break loop;
                default:
                    System.out.println("잘못된 번호 입니다.");

            }


        }
    }
}
