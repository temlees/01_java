package main.java.com.ohgiraffers.section02.package_and_import;


import main.java.com.ohgiraffers.section01.method.Calculator;

import static main.java.com.ohgiraffers.section01.method.Calculator.maxNumberOf;


public class Application02 {

    public static void main(String[] args) {
        
        /*
        * 임포트란 ?
        * 서로 다른 패키지에서 존재하는 클래스를 사용하는 경우 패키지명을 포함한
        * 풀 클래스 이름을 사용
        * 하지만 패키지명을 생략하고 사용할 수 있는 import구문 이있다
        * import 는 package 선언문과 class 선언문 사이에 작성
        * 어떠한 패키지 내에있는 클래스를 사용할 것인지 미리 선언하는 효과
        * */
        Calculator calc = new Calculator();

        // non- static 메소드 호출
        int min = calc.minNumberOf(50,60);
        System.out.println(min);

        //static method 임포트에서 메소드까지 접근을 해야한다.
        int max = maxNumberOf(100,200);
        System.out.println(max);


    }
}
