package main.java.com.ohgiraffers.section05.logical;

public class Application02 {
    public static void main(String[] args) {
        /*
         * 논리 연산자의 우선순위 활용
         * && : and 연산자 11순위
         * || : 12순위
         * 논리 and 연산자가 or 연산자보다 우선순위가 높다.
         * */

        int num1 = 55;
        System.out.println("1부터 100사이인지 확인 :" + ((num1 > 1) && (num1 <= 100)));

        //영어 대문자인지 확인
        char ch1 = 'C';
        System.out.println("영어 대문자인지 확인 : " + ((ch1 >= 'A') && (ch1 <= 'Z')));

        char ch2 = 'c';
        System.out.println("영어 대문자인지 확인 : " + ((ch1 >= 'A') && (ch1 <= 'Z')));

        //대소문자 상관없이 영문자 Y인지 확인
        char so = 'y';
        char dae = 'Y';

        System.out.println("대소문자 상관없이 " + ((so == 'y') || (so == 'Y')));

        //영문자인지 확인
        //아스키코드 이용해서 확인 a = 97, z= 122 A=65 ,Z = 90

        char young = 'k';
        System.out.println("k 영문자인지 ? " + (('k' <= 90) && ('k' >= 65) || ('k' <= 122) && ('k' >= 97)));
    }
}
