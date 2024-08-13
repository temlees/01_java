package main.java.com.ohgiraffers.section01.extend;

public class Application {
    public static void main(String[] args) {

        /*
        * 상속
        *  : 상속은 현실세계의 상속과 비슷한 개념이다.
        * 부모가 가지고 있는 재산(자바에서는 멤버)를 자식이 물려받는 의미이다.
        * 클래스또한 부모 클래스와 자식 클래스로 역할을 나누어서 부모가 가지는
        * 멤버를 자식이 물려받아 자기의 멤버인것 처럼 사용할 수 있도록 만든기술
        *
        * 하지만 단순 물려받는 개념보다는 조금 더 나아가서
        * 자바에서 상속은 부모클래스의 확장개념을 가진다
        * 물려받아 자신의 것 처럼 사용하는 것 뿐만 아니라
        * 추가적인 멤버도 작성이 가능하다
        *
        * 특히 메소드 재정의(overing)이라는 기술이 이용해
        * 부모가 가진 메소드를 재정의 하는 것도 가능
        *
        *
        * 상속이라는 기술 이점
        * 1. 새로운 클래스를 작성할 시 기존에 작성한 클래스를 재사용 가능하다.
        * 1-1 재사용시 생산성을 크게 향상시킬 수 있다.
        * 1-2 공통적으로 사용하는 코드가 부모 클래스에서만 존재하면 수정사항이
        * 생길 시 부모만 수정해도 전체적으로 적용된다.(유지보수성 증가)
        * 2. 클래스간의 계층관계가 형성되며 다향성 문법적인 토대가 된다.
        *
        * 단점
        * 1. 부모 클래스의 기능을 추가/변경시 자식 클래스가 동작하는지 예측 힘듦
        * 2. 부모클래스의 변경도 쉽지않다
        * 자식클래스에서 중요하게 사용하는 기능인 경우 부모클래스가 함부로 수정하기 힘들다
        * 3.부모클래스에서 의미 있는 것이 자식클래스에서는 무의미할 수 도 있다
        *
        * 장단점을 고려했을때 상속은 재사용이라는 장점만 바라보게되면 오용가능성이 있다
        * 유지보수에 좋지않은 코드 작성확율이 있다
        * 상속은 IS-A  관계로 구분이 되는 관계에만 사용해야한다
        * (사람은 동물이다,개는 동물이다 -> 동물은 사람이다 ?)
        * */

        Car car = new Car();
        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        FireCar fireCar = new FireCar();
        fireCar.toString();
        fireCar.run();
        fireCar.soundHorn();
        //상속은 확장이다
        fireCar.sprayWater();


        Car test = fireCar;
        //자식을 부모에게 넣어준다.
        test.run();
        test.soundHorn();


        //자식이 갖고 있는 메소드를 찾지 못한다.
        //test.sprrayWater();

        System.out.println("레이싱카 테스트");
        RacingCar racingCar = new RacingCar();
        racingCar.run();
        racingCar.soundHorn();
        racingCar.stop();

        // FireCar fireCar1 = racingCar;


    }
}
