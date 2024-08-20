package main.java.com.ohgiraffers.section01.exception;

public class Application01 {
    public static void main(String[] args) throws Exception{
        /*
        * 예외처리
        * 자바 프로그램 작성시 자바 문법에 맞지않는경우
        * 코드를 컴파일 하려고 할 때 컴파일에러를 발생시킨다
        * 엄밀히 말하면 문법상 오류
        * 혹은 자바 문법에 맞게 작성해도 실행되면서 예상치 못하게 오류가능
        * 컴퓨터 프로그램이 동작하는 도중에 예상치 못한 사태가 발생하여
        * 실행중인 프로그램이 영향을 받는것을
        * 오류 예외  두가지로 구분가능
        *
        * 오류
        * :시스템 상에서 심각한 문제가 발생하여 실행중인 프로그램이 종료되는 것
        * 개발자가 미리 예측하는 것이 불가능하며 처리 불가
        *
        * 예외
        * :오류와 마찬가지로 비정상적으로 종료시키지만
        * 발생할 수 있는 상황 예측하고 처리할 수 있는 미약한 오류
        *
        * */

        ExceptionTest et = new ExceptionTest();
        et.checkEnoughMoney(5000,10000);
        et.checkEnoughMoney(10000,5000);

        System.out.println("프로그램을 종료합니다");
    }//main
}//class
