package main.java.com.ohgiraffers.secstion01.generic;

public class Application {
    public static void main(String[] args) {

        /*
        *   제네릭?
        *   제네릭이란 사전적인 의미로 일반적인 이라는 뜻
        *   자바에서 제네릭이란 데이터의 타입을 일반화한다는 의미
        *
        * 코드의 안정성을 높이고 중복코드를 줄이며 더 유연하고
        * 재사용 가능한 코드를 작성
        *
        * 제네릭은 클래스나 메소드에서 사용할 내부 데이터 타입을
        * 컴파일 시에 지정하는 방법을 말한다.
        * 컴파일시에 미리 타입검사를 시행하면
        * 클래스나 메소드 내부에서 사용되는 객체타입 안정성을 높일 수 있다
        * 반환값에 대한 타입 변환 및 타입 검사에 들어가는 코드 생략가능해진다.
        *
        * */

        // 타입을 Integer 로 인스턴스 생성하는 경우
        //기본자료형은 못넣고 Wrapper로 감싸줘야한다.
        GenericTest<Integer> gt1 = new GenericTest<>();

        gt1.setValue(10);
        System.out.println(gt1.getValue());
        System.out.println(gt1.getValue() instanceof Integer);

        GenericTest<String> gt2 = new GenericTest<>();
        gt2.setValue("홍길동");
        System.out.println(gt2.getValue());
        System.out.println(  gt2.getValue() instanceof String);

        GenericTest<Double> gt3 = new GenericTest<>();

        gt3.setValue(10.0);
        System.out.println(gt3.getValue());
        System.out.println(gt3.getValue() instanceof Double);
    }//main
}//class
