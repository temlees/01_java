package main.java.com.ohgiraffers.section02.package_and_import;

public class Application01 {
    public static void main(String[] args) {
        /*
        * 패키지란 ?
        * 서로 관련 있는 클래스 또는 인터페이스 등을 모아 하나의
        * 묶음으로 단위를 구성하는 것을 말한다.
        * 같은 패키지 내에서는 동일한 이름의 클래스 x
        * 패키지 다르면 동일 이름 클래스 가능
        * 클래스 명은 원래 패키지명을 포함 되어있기때문.
        *
        * */

        //이전에 만들 Calculator 클래스를 사용해서 Static과 nonstatic 메소드 호출

        // 1. non statiic 메소드 호출
        main.java.com.ohgiraffers.section01.method.Calculator calc = new main.java.com.ohgiraffers.section01.method.Calculator();
        int min = calc.minNumberOf(30,20);
        System.out.println(min);

        //static 메소드 호출
        int max = main.java.com.ohgiraffers.section01.method.Calculator.maxNumberOf(30,20);
        System.out.println(max);

    }//main
}//class
