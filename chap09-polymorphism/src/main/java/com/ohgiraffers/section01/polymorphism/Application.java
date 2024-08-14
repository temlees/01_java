package main.java.com.ohgiraffers.section01.polymorphism;

public class Application {

    public static void main(String[] args) {


        /*
        * 다형성
        * 다형성이란 ? 하나의 인스턴ㅅ가 여러가지 타입을 가질 수 있는것을 의미
        * 그렇기 때문에 하나의 타입으로 여러타입의 인스턴스를 처리할 수 있기도하다
        * 하나의 메소드 호출로 객체별로 각기 다른 방법으로 동작하게 할 수도 있다.
        *
        * 다형성의 장점
        * 1. 여러 타입의 객체를 하나의 타입으로 관리할 수 있기 때문에
        * 유지보스성과 생산성이 증가한다.
        * 2. 상속을 기반으로 한 기술이기 때문에 상속 괸계에 있는 모든객체는
        * 동일한 메세지를 수신 가능하다
        * 이런 동일한 메세지를 수신받아 처리하는 내용을 객체별로 다르게 할 수 있다는 장점을 가진다
        * (다양한 기능을 사용하는데 관리해야할 메세지 종류가 줄어든다)
        * 하나의 호출로 여러가지 동작을 수행할 수 있다는 측면에서
        * 오버로딩을 다형성으로 보기도 한다.
        * 3. 확장성이 좋은 코드를 작성가능
        * 4. 결합도를 낮춰서 유지보수성 증가시킬 수 있다.
        * */

        System.out.println("------Animal 생성---------");
        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();

        System.out.println("----Rabbit 생성-----");
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();

        System.out.println("--Tiger-------------");
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();

        //부모 타입으로 자식 인스턴스 주소값 저장
        //래빗 점프나 타이거 바이트는 갖고 있으나 비활성화가 된다.
        //부모가 가지고 있는 것만 사용 가능
        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();

        //하지만 반대로 animal은 tiger나 rabbit이 아니다.
     //   Rabbit r = new Animal();
      //  Tiger t = new Animal();

        //동적 바인딩 확인
        /*
        * 동적 바인딩이란 ?
        * 컴파일 당시에는 해당 타입의 메소드와 연결되어 있다가
        * 런타임 당시 실제 객체가 가진 오버라이딩된 메소드로
        * 바뀌어 동작하는 것을 의미한다.
        * 
        * 막상 컴파일 시 자식에 있는 주소로 가서 실행한다는 뜻
        * */
        System.out.println("-------동적 바인딩--------");
        animal1.cry();
        animal2.cry();

        //타입  형변환
        //고유한 객체 메서드를 실행하기위해서 한다
        System.out.println("----타입의 형변환----");
        ((Rabbit)animal1).jump();
        ((Tiger)animal2).bite();

        //타입 형변환 잘못하는 경우
        //컴파일러에 는 있지만 
        //실제 animal1에는 bite가 없는경우 조심
       // ((Tiger)animal1).bite();

        //상속을 받은 타입도 함께 가지고 있는 것 확인
        System.out.println("animal1이 Rabbit과 같은지 "+ (animal1 instanceof Rabbit));
        System.out.println("animal1이 Animal과 같은지 "+ (animal1 instanceof Animal));

        /*
        * up-casting : 상위 타입으로 형변환
        * down-casting : 하위 타입으로 형변환
        *
        * */
        Animal animal3 = new Rabbit();//묵시적 upcasting
        Animal animal4 = (Animal) new Rabbit();//명시적

        //자식 자료형으로 가려면 형변환을 명시적으로 해야한다.
      //  Rabbit rabbit1 = (Rabbit) new Animal();
    }
}
