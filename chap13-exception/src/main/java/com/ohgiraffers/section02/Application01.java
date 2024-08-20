package main.java.com.ohgiraffers.section02;

public class Application01 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try{
            //상품가격보다 가진돈이 적을 경우
          //  et.checkEnoughMemory(50000,30000);

            //상품가격이 음수인 경우
         //   et.checkEnoughMemory(-5000,5000);

            //가진 돈이 음수인 경우
            et.checkEnoughMemory(5000,-5000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
