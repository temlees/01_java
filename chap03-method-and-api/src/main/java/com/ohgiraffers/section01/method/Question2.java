package main.java.com.ohgiraffers.section01.method;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        /*
         * 계산기에 필요한 기능 +  - - / % 총 5가지
         *
         * 첫번째 숫자를 입력하세요
         * 2
         * 연산할 기호를 쓰세요
         * +
         * 두번째 숫자를 입력하세요 :
         * 2
         * 결과는 4 입니다
         * */
        Scanner sc = new Scanner(System.in);
        Question2 q = new Question2();
        System.out.println("첫번째 숫자를 입력하세요 :");

        int a = sc.nextInt();
        System.out.println(a);
        System.out.println("연산할 기호를 쓰세요 : ");
        char c = sc.next().charAt(0);
        System.out.println('c');
        System.out.println("두번째 숫자를 입력하세요");
        int b = sc.nextInt();
        System.out.println(b);
if(c=='+' || c=='-' || c=='*' || c=='/' ||c=='%') {
    if (c == '+') {
        System.out.println(q.hap(a, b));
    } else if (c == '-') {
        System.out.println(q.minus(a, b));
    } else if (c == '*') {
        System.out.println(q.gop(a, b));
    } else if (c == '/') {
        System.out.println(q.nanum(a, b));
    } else System.out.println(q.namuge(a, b));

}else System.out.println("잘못된 연산기호 입니다");
    }//main

    public int hap(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int gop(int a, int b) {
        return a * b;
    }

    public int nanum(int a, int b) {
        return (int)(a / b);
    }

    public int namuge(int a, int b) {
        return (int)(a % b);
    }
}//class
