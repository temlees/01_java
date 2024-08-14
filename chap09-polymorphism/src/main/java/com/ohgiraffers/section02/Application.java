package main.java.com.ohgiraffers.section02;

public class Application {
    public static void main(String[] args) {

        /*
        ex) 회사 직급별 출입증
        * 추상 클래스와 추상 메소드
        * 추상 메소드를 0개이상 포함하는 클래스를 말한다
        * 추상클래스는 선언부에 abstract(추상적인)키워드를 명시한다
        * 추상클래스로 인스턴스 생성 불가능
        * 추상클래스를 사용하려면 추상 클래사를 상속받은 하위 클래스에서
        * 인스턴스를 생성해야한다.
        * 이 때 추상 클래스는 상위 타입으로 사용될 수 있으며 , 다형성을 이용할 수 있다
        *
        * 추상 클래스에서 작성한 메소드는 반드시 오버라이딩해서 작성해야하며
        * 후선 클래스들의 메소들의 공통 인터페이스 역할을 할 수 있다
        * 추상클래스에 작성한 메소드를 호출하게 되면 실제 후손타입의
        * 인스턴스가 가지는 메소드는 다형성이 적용되어
        * 동적 바인딩에 의해 다양한 응답을 할 수 있다.
        *
        * 추상클래스를 상속받아 구현할 때는 extends 키워드를 사용
        * 자바에서는 extends로 클래스를 상속받을시 하나의 부모 클래스만 가질수 있다 - 단일상속
        *
        * 추상메소드란 ?
        * 메소드의 선언부만 있고 구현부가 없는 메소드를 추상 메소드라고한다
        * 추상 메소드 같은경우 반드시 abstrack 키워드를 메소드 헤더에 작성해야한다
        * ex)public abstract void method();
        * */

       //추상클래스로 직접 인스턴스 생성 불가능
     //   Product product = new Product();

        Smartphone smartphone = new Smartphone();
        System.out.println(smartphone instanceof Smartphone);
        System.out.println(smartphone instanceof Product);

        //다형성 적용
        Product product = new Smartphone();
        product.agstractMethod();
        product.nonStaticField();

        //static 메소드
        product.agstractMethod();

        /*
        *
        * 추상클래스 쓰는 이유 ?
        * 추상클래스의 추상메소드는 오버라이딩에 대한 강제성이 부여된다.
        * 따라서 여러 클래스들을 그룹화 하여
        * 필수 기능을 정의하여 강제성을 부여해 개발 시 일관된 인터페이스를 제공할 수 있다.
        *
        * 하지만 다른 클래스를 상속받고있는 클래스를 작성할 때
        * 추상클래스를 추가로 상속받을 수 없다.
        * 그래서 추상클래스보다 더 강제성이 강한 인터페이스라는 매커니즘을 제공한다.
        *
        * */
    }
}
