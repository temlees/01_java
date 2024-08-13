package main.java.com.ohgiraffers.question;

public class Application {
    public static void main(String[] args) {
        //기본 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
        //필드 3가지 초기화하는 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
        //모든 필드를 초기화하는 생성자를 이용하여 인스턴스 생성 후 필드 값 출력.
        BookDTO dto = new BookDTO();
        System.out.println(dto);

        BookDTO dto1 = new BookDTO("자바의 정석","도우출판","남궁성");
        System.out.println(dto1 );

        BookDTO dto2 = new BookDTO("홍길동전","활빈당","허균",5000000,0.5);
        System.out.println(dto2);
    }
}
