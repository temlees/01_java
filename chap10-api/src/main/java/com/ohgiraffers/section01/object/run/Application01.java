package main.java.com.ohgiraffers.section01.object.run;

import main.java.com.ohgiraffers.section01.object.book.Book;

public class Application01 {
    public static void main(String[] args) {

      /*
      * 모든 클래스는 object클래스의 후손이다.
      * 따라서 object클래스가 가진 메소드를 자신의 것 처럼 사용가능
      * 또한 부모 클래스가 가지는 메소드를 오버라이딩해서 사용가능
      *
      * object클래스의 메소드중 관례상 많이 오버라이딩하는 메소드들
      * toString() , equals(), hashcod();
      * */

        Book book = new Book(1,"홍길동전","허균",50000);
        Book book2 = new Book(2,"목민심서","정양용",30000);
        Book book3 = new Book(3,"목민심서","정양용",30000);

        System.out.println("book1.toString(): " + book);
        System.out.println("book2.toString(): " + book2.toString());
        System.out.println("book3.toString(): " + book3.toString());
    }//
}//
