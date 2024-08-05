package main.java.com.ohgiraffers.section06.temary;

import java.util.Scanner;

public class Quest1 {
    public static void main(String[] args) {
        /*
        * 1. 영어시험을 본 결과 1번 학생은 90점, 2번 학생은 95점, 3번 학생은 81점을 맞았다.
            평균을 구한 후 논리 연산자를 이용해 90~100점 이면 합격을 출력
             아니면 불합격 출력


2. 승객의 놀이기구 탑승 가능여부를 출력하는 코드를 만들어 주세요.
   탑승 기준은 120cm 이상.
        * */


        int a = 90;
        int b = 95;
        int c =81;
        int avg = (a+b+c)/3;
        String result1  = (avg >=90 && avg<=100)? "합격" : "불합격";
        System.out.println(result1);

        Scanner k = new Scanner(System.in);
        int x = k.nextInt();
        String result2 = (x>=120)? "가능":"불가능";
        System.out.println(result2);
    }
}
