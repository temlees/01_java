package main.java.com.ohgiraffers.section03.interfaceImplements;

public class Application {
    public static void main(String[] args) {

        /*
        * 인터페이스
        * 자바의 클래스와 유사한 형태지만
        * 추상메서드와 상수 필드만 가질 수 있는 클래스의 변형체이다.
        *
        * 사용목적
        * 1. 추상클래스와 비슷하게 필요한 기능을 공통화 해서 강제성을
        * 부여할 목적으로 사용한다(표준화)
        * 2. 자바의 단일상속의 단점 극복 가능(다중상속)
        *
        * */

      // 불가능  InterProduct interProduct = new InterProduct();

        InterProduct interProduct = new Product();
        interProduct.abstractMethod();

        InterProduct.staticMethod();
        System.out.println(InterProduct.Max_NUM);
        System.out.println(InterProduct.MIN_NUM);
    }
}
