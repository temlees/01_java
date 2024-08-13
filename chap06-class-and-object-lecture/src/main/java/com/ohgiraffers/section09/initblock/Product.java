package main.java.com.ohgiraffers.section09.initblock;

public class Product {

    //1. 명시적 초기화

    private String name = "갤럭시";
    private int price = 100000;
    private static String brand ="삼성";

    //일반필드 초기화 블럭
    {
        name = "아이폰";
        price = 1500000;
        brand = "애플";
        System.out.println("인스턴스 초기화 블록 동작함...");
    }

    //정적 필드만 초기화 가능
    //일반필드는 초기화 불가
    static {
        brand = "엘지";
        System.out.println("정적 초기화블럭 동작");
    }

    public Product() {
        System.out.println("기본생성자 호출됨");
    }
    
    //매개변수 있는 생성자
    //위에서 초기화된 값을 다 무시하고 생성자에 작성한 초기화 내용으로 인스턴스 초기화

    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        //Static은 인스턴스 생성과 관련이 없어서
        Product.brand = brand;
        System.out.println("매개변수 있는 생성자 호출됨");
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand +
                '}';
    }
}
