package main.java.com.ohgiraffers.section01.intEnum;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        
        //정수 열거 패턴의 단점을 이해할 수 있다.
        
        int subject1 = Subjects.JAVA;
        int subject2 = Subjects2.HTML;
        
        //정수 값만을 가지고 잇는 필드
        if (subject1 == subject2) {
            System.out.println("두과목은 같다");
        }

        //문자열로 출력하기 불편하다.
        int num = 0;
        String subjectName = " ";

        switch (num) {
            case Subjects.JAVA : subjectName = "Java"; break;
            case Subjects.MYSQL: subjectName = "MySQL"; break;
            case Subjects.JDBC: subjectName = "JDBC"; break;
        }
        System.out.println("subjectName: " + subjectName);


        //타입 안전을 보장할 수 없다.(정수를 사용하기 때문이다)
     
    }

    public static void printSubject(int subjectNumber){
        String subjectName = " ";
/*
        switch (subjectName) {
            case Subjects.JAVA : subjectName = "Java"; break;
            case Subjects.MYSQL: subjectName = "MySQL"; break;
            case Subjects.JDBC: subjectName = "JDBC"; break;*/
    /*    }
        System.out.println("subjectName: " + subjectName);

*/
    }





}
