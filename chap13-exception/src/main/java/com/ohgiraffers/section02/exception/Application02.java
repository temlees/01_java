package main.java.com.ohgiraffers.section02.exception;

import main.java.com.ohgiraffers.section02.ExceptionTest;

public class Application02 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try{
            et.checkEnoughMemory(1000,-500);
        }catch (NotEnoughMoneyException e){
            e.printStackTrace();
            //같이 상속받은것은 or 연산자로 같이 쓸 수 있다.
        }catch (PriceNegativeException | MoneyNagativeException e){
            e.printStackTrace();
        }finally {
            //finally 무조건 동작하는 것
            System.out.println("무조건 마지막에 동작함");
        }
    }
}
