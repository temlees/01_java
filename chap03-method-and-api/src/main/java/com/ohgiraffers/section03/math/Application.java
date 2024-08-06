package main.java.com.ohgiraffers.section03.math;


import java.util.Random;

public class Application {
    public static void main(String[] args) {
        /*
        * api 란?
        * applicatioin programing interface는 응용 프로그램에서 사용할 수 있도록
        * 운령체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스
        * jdk를 설치하면 사용할 수 있도록 제공해 놓은
        * 소스코드(클래스나 인터페이스)들을 의미한다
        * 쉽게말해 누가 작성해놓은 코드를 가져다 쓰는 것.
        * */

        /*
        * java.lang.Math
        * math 클래스는 수학에서 자주 사용되는 상수들과 함수들을 미리 구현해 놓은
        * 클래스이다.
        * 모든 메소드는 static메소드로 정의 됨
        * (객체의 상태를 관리하지않고 기능만 제공하는 경우
        * 메모리를 효울적으로 사용하기 위해자주사용되는 기법)
        *
        * */

        //별도의 import 없이도 사용가능
        System.out.println("-7의 절대값 :"+(Math.abs(-7)));

        System.out.println("10과 20중 더 작은것 : "+ Math.min(10,20));
        System.out.println("10과 20중 더 작은것 : "+ Math.max(10,20));
        System.out.println((int)Math.PI);

        //난수 발생 시키는 방법
        //Math.radom()-> 0~0.9999 사이 값을 랜덤으로 생성

        System.out.println("난수 발생 :" +( (int)(Math.random() * 10) +1));

        //Random 클래스 사용
        Random random = new Random();

        //0~9까지
        int randomNumber = random.nextInt(10);
        System.out.println(randomNumber);


        //-128 ~ 127
        int  randomNumber2 = random.nextInt(256)-128;
        System.out.println(randomNumber2);

        // 1~5
        int math5 = (int)(Math.random()*5) +1;
        System.out.println(math5);

        //8~23
        int math8 = random.nextInt(16)+8;
        System.out.println(math8);

        //-56 ~56
        int math56 = (int)(Math.random()*113)-56;


    }//main
}//class
