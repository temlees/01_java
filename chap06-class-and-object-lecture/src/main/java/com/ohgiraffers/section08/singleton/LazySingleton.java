package main.java.com.ohgiraffers.section08.singleton;

public class LazySingleton {
    private static LazySingleton lazy;


    private LazySingleton() {
        System.out.println("lazy 생성됨");
    }

    //인스턴스 생성한적 없으면 생성후 넘겨줌
    //있으면 인스턴스 넘겨줌
    public static LazySingleton getInstance() {
        if(lazy == null) {
            System.out.println("lazy 가 null");
            lazy = new LazySingleton();
        }
        System.out.println("lazy가 null 이 아님");
        return lazy;
    }
}
