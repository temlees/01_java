package main.java.com.ohgiraffers.section08.singleton;

public class EagerSingleton {

    //클래스 내부에서 인스턴스를 생성하고 그것을 리턴하고
    //스태틱으로 인스턴스 생성을 막아 놓았다
    private static EagerSingleton eager = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return eager;
    }
}
