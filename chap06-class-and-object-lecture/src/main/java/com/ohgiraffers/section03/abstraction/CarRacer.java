package main.java.com.ohgiraffers.section03.abstraction;

public class CarRacer {

    //카레이서 객체는 자기만의 고유한 자동차를 가지게 된다.
    private final Car car = new Car();

    //this.car 의 시동거는 메소드
    public void startUp() {
        car.startUp();
    }//startUp()


    // this.car go 메소드를 호출하여 앞으로 가는 메소드
    public void stepAccelator() {
        car.go();

    }//stepAccelator

    //this.car 멈추는 메소드
    public void stepBreak() {
        car.stop();
    }//stepBreak

    // this.car 에 시동 끄는 메소드
    public void turnOff() {
        car.turnOff();
    }//turnOff

}//class
