package main.java.com.ohgiraffers.section02.understand;

import main.java.com.ohgiraffers.section02.understand.car.Car;
import main.java.com.ohgiraffers.section02.understand.car.ElectricCar;
import main.java.com.ohgiraffers.section02.understand.car.OldCar;
import main.java.com.ohgiraffers.section02.understand.employee.Seller;

public class Application {

    public static void main(String[] args) {

        System.out.println("자동차 판매 프로그램 입니다.");
        System.out.println("전기차 ");
        ElectricCar ionic1 =  new ElectricCar("H",1000,"ionic1","1000km");
        ElectricCar ionic2 =  new ElectricCar("H",1500,"ionic2","1500km");
        ElectricCar ionic3 =  new ElectricCar("H",2000,"ionic3","2000km");
        ElectricCar kona =  new ElectricCar("H",2100,"kona","2100km");

        System.out.println("내연기관 자동차");
        OldCar poter = new OldCar("H",1500,"poter","disel");
        OldCar avante = new OldCar("H",1500,"avante","gasoline");
        OldCar sonata = new OldCar("H",2000,"sonata","gasolin");

        System.out.println("영업사원 입사");
        Seller seller = new Seller("홍길동");

        //부모의 car[]에 넣어줄 수 있다.
        // 타입이 다른 객체들을 같은 배열에 넣으려면
        // 부모 클래스 타입의 배열을 만들어서 넣어주면 가능하다.
        // 그렇게 되면 같은 메소드로 출력해도 다른 값이 나오게 되어 다향성에 좋다
        Car[] cars = {poter,kona,ionic2,sonata,avante};
        seller.sale(cars);
        System.out.println("결산 :"+seller);
    }
}
