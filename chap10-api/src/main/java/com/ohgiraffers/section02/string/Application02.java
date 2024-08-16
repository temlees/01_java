package main.java.com.ohgiraffers.section02.string;

public class Application02 {
    public static void main(String[] args) {

        /*
        * 문자열 객체를 만드는 방법
        * "" 리터럴 형태 :동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다(singketon)
        * new String("문자열") : 매번 새로운 인스턴스를 생성한다.
        * */

        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        //객체를 생성해주면 주소끼리 비교
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str3 == str4);

        //String 실제 주소는 달라도  toString으로 오버라이딩 해줘서 같다고 나온다
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());

        str2 +="oracle";

        System.out.println(str1 == str2);
        
        /*
        * equals() String 클래스의 equals() 메소드는
        * 인스턴스 비교가 아닌 문자열 값을 비교하여
        * 동일한 값을 가지는 경우 true 다른값이면 false를 반환하도록 오버라이딩 
        * 따라서 문자열 인스턴스 생성방식과 상관없이 동일한 비교를 위해 연산대신
        * equals()메소드를 사용해야한다
        * 
        * */
    }//main
}
