package main.java.com.ohgiraffers.section01.conditional.question;

import java.util.ArrayList;

public class Question2 {
    public static void main(String[] args) {
        /*
        * 피보나치 수열(An = An-1 + An-2)을 화면에 출력
        * 1.결과값 {1 1 2 3 4 5 13 21 34}
        * 2.for문과 배열을 이용해 코드를 간소화
        * 9개 까지 출력
        * */


        int [] fibo = new int [9];
        fibo[0] = 1;
        fibo[1] = 1;
        System.out.println(fibo[0]);
        System.out.println(fibo[1]);
       // for (int i = 0; i < 9 ; i++) {
        //    fibo[i+2] = fibo[i+1] + fibo[i];
       //     System.out.println(fibo[i]);

            for (int i = 2; i < fibo.length ; i++) {
                fibo[i] = fibo[i-1] + fibo[i-2];
                System.out.println(fibo[i]);
        }






    }
}
