package main.java.com.ohgiraffers.section02;

public  abstract class Product {

    //추상클래스는 생성자,필드를 가질수 있다

    private int nonStaticField;

    private int staticField;

    //추상클래스로 인스턴스는 만들 수 없다
    public Product() {
    }


    public void nonStaticField(){
        System.out.println("Product 클래스의 nonStaticField를 호출함");
    }

    public void setStaticField(){
        System.out.println("Product 클래스의 StaticField를 호출함");

    }

    //추상메소드 몸체 x
    //상속받을 클래스는 이 메소드를 가져야하는ㅇ데
    //받은 클래스는 반드시 이 메소드를 재정의 해줘야한다.
    public abstract  void agstractMethod();
}
