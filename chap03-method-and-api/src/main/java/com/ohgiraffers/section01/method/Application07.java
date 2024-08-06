package main.java.com.ohgiraffers.section01.method;

public class Application07 {
    public static void main(String[] args) {

        /*
        * static 메소드 호출
        * static 메소드 호출방법
        * 클래스명.메소드명();
        * */

        System.out.println("10과 20의합 :" +Application07.sumTwoNumbers(10,20));

        //동일한 클래스 내에 작성된 static메소드는 클래스명도 생략 가능하다
        System.out.println(sumTwoNumbers(10,20));
    }//main

    public static int sumTwoNumbers(int num1, int num2) {

        return num1 + num2;
    }//sumtwonum
}//class
