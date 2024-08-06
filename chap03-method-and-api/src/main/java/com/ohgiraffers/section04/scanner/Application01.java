package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {
        /*
         * java.util.scanner
         * 콘솔 화면에 값을 입력 받는 기능.
         * */
        Scanner sc = new Scanner(System.in);
        System.out.println("이름 입력 : ");

        String name = sc.nextLine();//엔터까지 모든 단어
        System.out.println("안녕하세요" + name + "님!");

        System.out.println("나이 입력 : ");
        int age = sc.nextInt();
        System.out.println("나이는 : " + age + "세가 맞습니까?");

        System.out.println("금액을 입력 해주세요 :");
        long money = sc.nextLong();
        System.out.println("입력하신 금액이" + money + "입니다");

        // 실수
        System.out.println("원하는 실수 입력 : ");
        double number = sc.nextDouble();
        System.out.println("입력하신 실수 : " + number + "입니다");
        
        
        // 논리형
        System.out.println("true or false 입력: ");
        boolean isTrue = sc.nextBoolean();
        
        if (isTrue == true) {
            System.out.println("참이다");
        }else {
            System.out.println("거짓이다");
        }//else

        sc.nextLine();//nextLine()을 다시 사용할 때 비워주고 사용해야한다.

        //문자형 값 입력
        //문자하나는 nextChar()가 없으므로 nextLine()dp .charAt()이라는 메소드로
        System.out.println("아무 문자나 입력 하시오 : ");
        char charValue = sc.nextLine().charAt(0);//nextLine에서 첫번쨰 인덱스값 가져온다.
        System.out.println("입력하신 문자는 :"+charValue+ "입니다");

    }//main
}//class
