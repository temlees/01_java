package main.java.com.ohgiraffers.section07.finalkeyword;

public class FinalFieldTest {

    /*
     *
     * final
     * final 은 종단의 의미를 갖는다
     * final 키워드는 사용할 수 있는 위치는 다양하며
     * 변경 불가 의미이다
     *
     * 1. 지역변수 : 초기화 이후 값 변경 불가
     * 2. 매개변수 : 호출시 전달한 인자 변경불가
     * 3. 전역변수 : 인스턴스 생성 후 초기화 이후에 값 변경 불가
     * 4. 클래스(static)변수 : 프로그램 시작 이후 변경 불가
     * 5. non-static 메소드 : 메소드 재작성 불가
     * 6.static 메소드 : 메소드 재작성 불가
     * 7. 클래스 : 상속 불가
     *
     * final은 변경 불가의 의미를 가진다
     * 따라서 초기 인스턴스가 생성되고 나면 기본값 0 이필드에 들어가는데
     * 그 초기화 이후 값을 변경할 수 없기 때문에 선언하면서 바로 초기화를 해주어야 한다.
     * 그렇지 않으면 컴파일 에러가 발생한다.
     * */

   // private final int nonStaticNum;

    //선언과 동시에 초기화
    private final int NON_STATIC_NUM = 1;

    //생성자를 이용해 초기화 함.
    private final String NON_STATIC_NAME;

    public FinalFieldTest(String NON_STATIC_NAME) {
        this.NON_STATIC_NAME = NON_STATIC_NAME;
    }

    /*
    * static 에도 자바에서 지정한 기본값이 초기에 대입되기 때문에
    * final 키워드 사용 시 초기화를 하지 않으면 에러가 발생한다
    *
    * 생성자를 이용한 초기화는 불가능하다(static일때)
    * 생성자는 인스턴스가 생성되는 시점에 호출되기때문에
    * 그 전에는 초기화가 일어나지 못한다.
    * 하지만 static 은 프로그램이 시작될 때 할당되기 때문에
    * 초기화가 되지않은 상태로 선언된것과 동일하여
    * 기본값으로 초기화 된후 값을 변경하지 못하기 때문에 에러가 난다.
    * */

    private static final int STATIC_NUM = 10;

    //초기화 블럭
    private static final double STATIC_DOUBLE;
    private static final double STATIC_DOUBLE1;

    static{
        STATIC_DOUBLE = 10;
        STATIC_DOUBLE1 = 20;
    }
}
