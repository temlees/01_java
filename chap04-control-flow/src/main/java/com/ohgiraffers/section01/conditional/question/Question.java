package main.java.com.ohgiraffers.section01.conditional.question;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        /*
        * a,b,c 세 과목의 점수를 스캐너로 입력 받고 세과목의 점수를
        * 메소드를 생성해 매개변수로 전달해 계산하고,
        * 평균과 점수를 이용하여 합격/불합격
        * (합격조건 : 세과목의 점수가 각각 40 이상 ,평균 60초과
        * 합격 했으면 평균 점수와 합격입니다 출력
        * 불합격이면 불합격 출력
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("a과목 점수 입력");
        int a = sc.nextInt();
        System.out.println("b과목 점수 입력");
        int b = sc.nextInt();
        System.out.println("c과목 점수 입력");
        int c = sc.nextInt();

        Question q = new Question();
            q.quest(a,b,c);

    }//main

    public void quest(int a, int b, int c){
        int avg = (a+b+c)/3;
        if(a >=40 && b>=40 && c>40 && avg>=60) {
            System.out.println("평균점수 "+avg + "와 합격입니다!");

        }else {
            System.out.println("불합격입니다");
        }
    }//quest



}//class
