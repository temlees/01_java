package main.java.com.ohgiraffers.section02.enumType;

public class Application {
    public static void main(String[] args) {

        // 열거 타입으로 선언된 인스턴스는 싱글톤으로 관리된다
        //새롭게 HEAP에 만드는것이 아닌 만들어진 인스턴스사용
        Subjects subjects1 = Subjects.JAVA;
        Subjects subjects2 = Subjects.HTML;
        
        if(subjects1 == subjects2){
            System.out.println("두과목은 같은과목");
        }else {
            System.out.println("두 과목은 다른과목");
        }

        //단일 인스턴스를 보장하기에 == 비교가 가능하다
        System.out.println(subjects1==Subjects.JAVA);

        //문자열로 변경하기 쉽다.
        System.out.println(Subjects.JAVA.toString());

        //values()를 이용해서 상수값 배열을 반환하고
        //이를 연속 처리할 수 있다.
        Subjects[] sujects = Subjects.values();
        for(Subjects s : sujects){
            System.out.println(s);
        }
        //타입안전성 보장
        printSubject(Subjects.HTML);

    }
    public static void printSubject(Subjects subject){
        System.out.println(subject.toString());
    }
}
