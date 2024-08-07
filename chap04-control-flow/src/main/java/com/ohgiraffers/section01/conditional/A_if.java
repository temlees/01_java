package main.java.com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {

    public void testSimpleIfStatement() {

        /*
         * if문 표현식
         * if(조건식){
         *   조건식이 true 일 때 실행할 명령문.
         * }
         *
         * 조건식 : true or fasle 가 나오는 연산식을
         * 조건식 이라고 한다. if문은 조건식의 결과 값이
         * 참 이면 {}안 코드 실행  거짓이면 else로
         * */

        // 정수 한 개를 입력 받아 그 수가 짝수이면
        //"입력하신 숫자는 짝수 입니다"
        //단, 조건에 상관없이 프로그램이 종료 될때
        //"프로그램을 종료 합니다 "라고 출력되도록한다.

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력해 주세요 : ");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("입력하신 숫자는 짝수입니다");

        }//if
        System.out.println("프로그램을 종료합니다.");
    }//testSimpleIfStatement

    public void testNestedIfStatement() {

        //중첩된 if문 실행 흐름 확인
        // 정수 한 개를 입력 받아  양수인 경우에 그 수가 짝수이면
        //"입력하신 숫자는 짝수 입니다"
        //단, 조건에 상관없이 프로그램이 종료 될때
        //"프로그램을 종료 합니다 "라고 출력되도록한다.

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력해주세여");
        int b = sc.nextInt();

        if (b > 0) {
            if (b % 2 == 0) {
                System.out.println("입력하신 숫자는 짝수 입니다.");
            }//if
        } else System.out.println("음수 or 0 입니다");

        System.out.println("프로그램 종료");
    }//testNestedIfStatement

}//A_if
