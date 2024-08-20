package main.java.com.ohgiraffers.section01.exception;

public class Application02 {
    public static void main(String[] args) {

        //try -catch를 이용한 예외처리

        ExceptionTest et = new ExceptionTest();

        //에러발생할 수 있는 구문을 try문에 넣고
        //에러발생시에 catch로 보내 예외처리해준다
        try{
            et.checkEnoughMoney(10000,50000);
            et.checkEnoughMoney(10000,5000);
            System.out.println("==상품구입가능==");
        }catch (Exception e){
            System.out.println("money가 price보다 작습니다");
            //발생하는 에러메세지 담아주는 메소드
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");

    }//main
}//class
