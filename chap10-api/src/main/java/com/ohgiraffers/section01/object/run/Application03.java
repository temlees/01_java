package main.java.com.ohgiraffers.section01.object.run;

import main.java.com.ohgiraffers.section01.object.book.Book;

import java.util.HashMap;
import java.util.Map;

public class Application03 {
    public static void main(String[] args) {
        
        /*
        * object 클래스의 명세에 작성된 일반 규약에 따르면
        * equals()메소드를 재정의 하는 경우 반드시 hashcode()도
        * 재정의 하게 되어있다.
        * 
        * 만약 해쉬코드를 재정의 하지 않으면 같은값을 가지는
        * 동등객체는 같은 해쉬코드값을 가져야 한다는 규약위반
        * 
        * */

        Book book1 = new Book(1,"홍길동","허균",50000);
        Book book2 = new Book(1,"홍길동","허균",50000);

        System.out.println("book1.hashcode: " + book1.hashCode());
        System.out.println("book1.hashcode: " + book2.hashCode());
        
        //해쉬코드를 재정의 하지 않았을 때 문제점

        Map<Book,String> map = new HashMap<>();
        map.put(new Book(1,"홍길동","허균",50000),"selled");

        String str = map.get(new Book(1,"홍길동","허균",50000));

        System.out.println(str);
    }
}
