package main.java.com.ohgiraffers.section01.method;

public class Application08 {
    public static void main(String[] args) {

        //다른 클래스에 작성한 메소드 호출

        //non static 매소드
        //클래스가 다르더라도 사용하는 방법은 동일하다.
        Calculator calc =new Calculator();
        int first = 100;
        int second = 50;
        int min = calc.minNumberOf(first, second);
        System.out.println(min);

        //static 메소드
        //다른 클래스에 작성한 static 메소드의 경우 호출할때 반드시 클래스명을 기술한다.
        System.out.println(Calculator.maxNumberOf(first,second));
    }
}
