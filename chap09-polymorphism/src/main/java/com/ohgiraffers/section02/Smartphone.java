package main.java.com.ohgiraffers.section02;

public class Smartphone extends Product {
    
    //추상클래스를 상속받으면 반드시 추상메소드를 오버라이딩(재정의)해줘야한다
    //내용은 다 다르다
    //단점 : 추상클래스를 상속받고 있기 때문에 다른클래스를 상속받지 못한다
    // 이를 해결하기위해 interface
    @Override
    public void agstractMethod() {
        System.out.println("Product 클래스의 추상메소드를 호출함");
    }
    
    public void printSmartPhone(){
        System.out.println("Smartphone의 print메소드를 호출함");
    }
}
