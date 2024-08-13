package main.java.com.ohgiraffers.section01.init;

public class Application {
    public static void main(String[] args) {

        /*
        * 객체 배열?
        * 객체 배열은 레퍼런스 변수에 대한 배열이다.
        * 생성한 인스턴스도 배열을 이용햐서 관리하면
        * 동일한 타입의 여러개의 인스턴스를 각각 취급하지 않고
        * 연속처리 할 수 있다
        * 또 반환값은 1개만 반환가능
        * 동일한 타입의 여러 인스턴스를 반환해야하는 경우
        * 객체 배열 이용 가능하다.
        * */

        Car car1 = new Car("페라리",300);
        Car car2 = new Car("람보르기니",350);
        Car car3 = new Car("롤스로이스",250);
        Car car4 = new Car("부가티",400);
        Car car5 = new Car("소나타",200);

        car1.driveMaxSpeed();
        car2.driveMaxSpeed();
        car3.driveMaxSpeed();
        car4.driveMaxSpeed();
        car5.driveMaxSpeed();

        Car [] carArray = new Car[5];
        carArray[0] = new Car ("페라리",300);
        carArray[1] =new Car("람보르기니",350);
        carArray[2] = new Car("롤스로이스",250);
        carArray[3] =  new Car("부가티",400);
        carArray[4] =  new Car("소나타",200);

        System.out.println("-----------------");
        for (int i = 0; i < carArray.length; i++) {
            carArray[i].driveMaxSpeed();
        }
        System.out.println("----------------");
        for(Car car :carArray){
            car.driveMaxSpeed();
        }

    }
}
