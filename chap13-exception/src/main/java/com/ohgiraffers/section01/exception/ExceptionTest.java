package main.java.com.ohgiraffers.section01.exception;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money)throws Exception{
        System.out.println("가지고 있는 돈은 "+money +"원 입니다");
        if(money > price){
            System.out.println("돈이 충분합니다");
        }else {
            //강제로 예외 발생
            //예외 발생 메소드 헤드에 throws구문 추가
            throw new Exception();
        }
        System.out.println("즐거운 쇼핑하세요");
    }
}
