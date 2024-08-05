package main.java.com.ohgiraffers.section01.method;

public class Application02 {
    public static void main(String[] args) {

        System.out.println("main()메서드 호출됨");
        /*
        static메서드에서
        * non static method 호출방법
        * (메서드가 들어있는 클래스명)(사용할 이름) = new(클래스이름());
        * 사용할 이름.메서드
        static 없는 곳에서는 바로 이름으로 호출 가능
        * */
        Application02 app2 = new Application02();
        app2.methodA();
        app2.methodB();
        app2.methodC();
        System.out.println("main()메서드 종료됨");

    }//main

    public void methodA() {
        System.out.println("methodA()호출됨");
        System.out.println("methodA()종료됨");
    }

    public void methodB() {
        System.out.println("methodB()호출됨");
        System.out.println("methodB()종료됨");
    }

    public void methodC() {
        System.out.println("methodC()호출됨");
        System.out.println("methodC()종료됨");
    }
}//class
