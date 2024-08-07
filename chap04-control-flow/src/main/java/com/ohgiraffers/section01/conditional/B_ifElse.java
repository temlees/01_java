package main.java.com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {

    public void testB() {

        /*
         * 정수 한 개를 입력 받아 그 수가 홀수 -> 입력하신 숫자 홀수
         * 홀수 아니면 짝수
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력 : ");
        int s = sc.nextInt();

        if (s % 2 == 1) {
            System.out.println("홀수");

        } else {
            System.out.println("짝수");
        }//else
        System.out.println("프로그램종료");


    }//testB

    public void  testIf(){
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력해주세여");
        int b = sc.nextInt();

        if (b > 0 &&  b!= 0)  {
            if (b % 2 == 0) {
                System.out.println("입력하신 숫자는 짝수 입니다.");
            }//if
        } else System.out.println("0 입니다");

        System.out.println("프로그램 종료");
    }
}
