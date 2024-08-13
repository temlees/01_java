package main.java.com.ohgiraffers.section08.singleton;

public class Application {
    // 싱글톤이란 ? 인스턴스를 한번만 생성...
    public static void main(String[] args) {
        /*
        * singleton pattern이란 ?
        * 
        * 에플리케이션이 시작될 때 어떤 클래스가 최초한번만 
        * 메모리를 할당하고 그 메모리에 인스턴스를 만들어서
        * 하나의 인스턴스를 공유해서 사용하며
        * 메모리 낭비를 방지할 수 있게함(메번 인스턴스 생성 x)
        * 
        * 장점
        * 1. 첫 번째 이용시에 인스턴스를 생성해야하므로 속도차이 x
        * 두번째 이용시에 생성하지 않아서 속도 높음
        * 2. 인스턴스가 절대적으로 한 개만 존재하는걸 보장가능
        * 
        * 단점
        * 1. 싱글톤 인스턴스가 너무 많은 일을 하거나 많은 데이터 공유시 결합도가 높아짐(유지보수 문제)
        * 2. 동시성 문제를 고려해서 설계해야 해서 난이도 높음
        *
        * 싱글톤 구현 방법
        * 1. 이른 초기화
        * 2. 게으른 초기화
        *
        *
        * */

        //이른초기화
        //EagerSingleton eager = new EagerSingleton();
        EagerSingleton eager1 = EagerSingleton.getInstance();
        EagerSingleton eager2 = EagerSingleton.getInstance();
        
        // 이미 생성된 인스턴스를 받아와서 두 인스턴스의 주소값은 같다
        System.out.println("eager1.hashcode() = " + eager1.hashCode());
        System.out.println("eager2.hashcode() = " + eager2.hashCode());

        //게으른 초기화
        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();

        System.out.println(lazy1.hashCode());
        System.out.println(lazy2.hashCode());

        /*
        * static
        * 정적 메모리 영역에 프로그램이 시작 될 때 할당하는 키워드
        * 인스턴스를 생성하지 않고도 사용할 클래스의 멤버에 지정할 수 있다
        * 여러 인스턴스가 공유해서 사용할 목적의 공간
        * 하지만 static 키워드의 남발은 유지보수가 힘듦
        * 명확한 목적이 있을때만 사용
        * 의도적으로 static 키워드를 사용하는 예
        * singleton 객체 생성할 때..
        * */
    }
}
