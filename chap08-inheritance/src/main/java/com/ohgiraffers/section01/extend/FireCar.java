package main.java.com.ohgiraffers.section01.extend;

public class FireCar extends Car {

    public FireCar() {
        //모든 생성자는 super()를 숨기고있음
        //super()는 부모에 대한 생성자 호출하는 부분
        super();
    }

    @Override
    public void soundHorn() {
        //부모의 메소드 호출
        if(isRunning()){
            System.out.println("빵빵");
        }else {
            System.out.println("소방차가 멈춰있습니다");
        }
    }

    public void sprayWater(){
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다.");
    }
}
