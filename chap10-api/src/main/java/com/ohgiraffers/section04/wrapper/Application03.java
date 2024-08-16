package main.java.com.ohgiraffers.section04.wrapper;

public class Application03 {
    public static void main(String[] args) {

        //기본자료형의 값을 문자열로 변경할 수 있다.

        /*
        * valueOF() : 기본자료형을 값을 Wrapper클래스로 변환시키는 경우
        * toString() : 문자열로 반환하는 메소드
        * */

        String b = Byte.valueOf((byte)1).toString();
        String s = Short.valueOf((short)2).toString();
        String i = Integer.valueOf((int)3).toString();

        String str = String.valueOf(10);

        String str2 = 123+ " ";
    }
}
