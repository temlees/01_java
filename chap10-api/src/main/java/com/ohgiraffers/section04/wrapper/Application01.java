package main.java.com.ohgiraffers.section04.wrapper;

public class Application01 {
    public static void main(String[] args) {

        /*
        * 상황에 따라 기본 타입의 데이터를 인스턴스화 해야하는 경우들이
        * 발생한다. 이 때 기본타입의 데이터를 먼저 인스턴스로 변환 후
        * 사용해야하는 데 8가지에 해당하는 기본 타입의 데이터를
        * 인스턴스화 할 수 있도록 하는 클래스를 래퍼클래스라고한다
        * 주방에서 사용하는 랩 과같이 감싼다는 의미
        * */

        /*
        * 기본타입 래퍼클래스
        * byte      BYTE
        * short    SHORT
        * int     Integer
        * long     Long
        * float     Float
        * double  Double
        * char      Character
        * boolean  Boolean
        *
        *
        * */

        /*
        * 박싱(Boxing) 언박싱(UnBoxing)
        * 기본 타입을 래퍼클래스의 인스턴스로 인스턴스화 하는 것 - 박싱
        * 래퍼클래스 -> 기본타입  -언박싱
        *
        *
        * */


        int intvalue = 20;
        //명시적
        Integer boxingNumber1 = new Integer(intvalue);
        Integer boxingNumber2 = Integer.valueOf(intvalue);

        int unboxingNumber1 = boxingNumber1.intValue();

        /*
        * 오토박싱, 오토 언박싱
        * jdk1.5 부터는 컴파일러가 자동으로 처리해준다
        * 이런 자동화 된 방식을 오토박싱,오토언박싱이라고 한다
        * */

        //박싱
        Integer boxingNumber3 = intvalue;

        //언박싱
        int unboxingNumber2 = boxingNumber3;

        //Wrapper클래스 값 비교

        int inum = 20;

        Integer inum1 = new Integer(20);
        Integer inum2 = new Integer(20);

        Integer inum3 = 20;
        Integer inum4 = 20;

        //기본 타입과 래퍼클래스 타입은 == 연산자로 비교 가능하다.
        System.out.println(inum1 == inum);
        System.out.println(inum == inum3);

        //생성자를 이용해 생성한 인스턴스의 경우  == 로 비교하지 못한다
        //단 오토박싱은 가능
        System.out.println(inum1 == inum2);
        System.out.println(inum1 == inum3);
        System.out.println(inum3 == inum4);

        //래퍼클래스 타입의 인스턴스를 비교할 때 equals()사용한다
        System.out.println(inum1.equals(inum2));
        System.out.println(inum1.equals(inum3));


    }//main
}
