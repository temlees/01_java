package main.java.com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseIf {

    public void testSimpleElseStatement() {
        /*
         * else if
         * */
        Scanner sc = new Scanner(System.in);

        System.out.println("어떤 도끼가 너의 도끼이냐 (1. 금도끼 2.은도끼 3.쇠도끼)");
        int num = sc.nextInt();

        if (num == 1) {
            System.out.println("엥 ?금도끼 내껀데 ?");
        } else if (num == 2) {
            System.out.println("엥? 은도기 내껀데 ?");
        } else if (num == 3) {
            System.out.println("솔직하구나 다 가지거라");
        } else {
            System.out.println("솔직하구나 셋중 하나 고르렴");
        }

    }//testSimpleElseStatement

    public void testC() {
        /*
        * 중첩된 else if 문 실행 흐름 확인
        *
        * A대학의 한 교수님은 학생들의 시험성적을 수기로 계산해서 학점 등급을 매기는 채점방식을 사용
            90점 이상이면 A 80점이상이면b 70이상이면 c 60점 이상이면 d 60점 미만이면f
            *추가로  각 등급의 중간점수(95 85 75 65)를넘는경우 + 를 붙여 세분화
            *
        * */

        Scanner sc = new Scanner(System.in);

        System.out.println("이름입력");
        String name = sc.nextLine();
        System.out.println("점수 입력 : ");
        int a = sc.nextInt();

        String grade = "";

        if (a >= 0 && a <= 100) {
            if (a >= 90) {
                grade = "A";
                if (a >= 95) {
                    grade += "+";
                }
            } else if (a >= 80) {

                grade = "B";
                if (a >= 85) {
                    grade += "+";
                }
            } else if (a >= 70) {
                grade = "C";
                if (a >= 75) {
                    grade += "+";
                }
            } else if (a >= 60) {
                grade = "d";
                if (a >= 65) {
                    grade += "+";
                }

            } else {
                grade = "F";
            }
            if (grade.equals("F")) {
                System.out.println(name + "학생은 f등급입니다 재수강 하세요");
            } else {
                System.out.println(name + "학생 점수는" + a + "이고" + grade + "등급입니다");
            }
        } else {
            System.out.println("올바른 시험점수가 아니다");
        }

        System.out.println("프로그램종료");

    }//testC


}//C_ifElseIf
