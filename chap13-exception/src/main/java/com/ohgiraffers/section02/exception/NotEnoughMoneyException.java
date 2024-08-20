package main.java.com.ohgiraffers.section02.exception;

public class NotEnoughMoneyException extends Exception {
    //예외 클래스를 만들기위해서는 Exceptions 상속받는다


    public NotEnoughMoneyException() {
    }

    //에러를 발생시킬때 메세지도 같이 출력할 목적의 메소드
    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
