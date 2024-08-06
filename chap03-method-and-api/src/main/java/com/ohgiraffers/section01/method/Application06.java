package main.java.com.ohgiraffers.section01.method;

public class Application06 {
    public static void main(String[] args) {
        /*
        * 메소드 리턴값 테스트
        * 메소드는 항상 마지막에 return 명령어가 존재한다
        * return은 자신을 호출한 구문으로 복귀하는것
        * 복귀할 때 값읋 가지고 복귀 가능
        * 이때 가지고 가는 값을 리턴값 이라고 한다
        *
        * return값을 반환하기 위해서는 메소드 선언부에 리턴 타입을명시 해야 한다
        * void는 아무 반환값을 가지지 않겠다는 키워드
        * 반환값이 없는 경우 return 을 생략해도 컴파일러가 자동으로 추가하지만
        * 반환값이 있는 경우 return 구문을 반드시 작성해야한다
        * 메소드 선언부에 선언한 리턴타입과 반환값의 자료형은 반드시 일치 해야한다.
        * */
        Application06 app6 = new Application06();
       String returnValue = app6.test();
        System.out.println(returnValue);
    }//main

    public String test(){

        //public 뒤에 바로 return값을 가지고 갈 타입 명시
        return "Hello World";
    }
}// class
