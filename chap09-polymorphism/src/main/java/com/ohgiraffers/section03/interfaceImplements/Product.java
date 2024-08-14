package main.java.com.ohgiraffers.section03.interfaceImplements;

public class Product extends Object implements InterProduct {
    
    
    /*
    * 클래스에서 인터페이스를 상속받을 때 implements 키워드를 사용한다.
    * 또한 인터페이스는 여러개를 상속받을 수 있으며,
    * extends로 다른 클래스를 상속받는 경우에도 그것과 별개로
    * 추가 상속이 가능해진다. 단 extends(상속)를 앞에 작성하고
    * 뒤에 Implements(인터페이스 상속) 를 작성한다 - 순서바뀌면 에러
    * */


    //추상메소드 반드시 오버라이딩
    @Override
    public void abstractMethod() {
        System.out.println("interProduct의 abstMethod 오버라이딩 메소드 호출");
    }

    //static method는 재정의 불가능
/*    @Override
    public static void staticMethod(){}*/


}
