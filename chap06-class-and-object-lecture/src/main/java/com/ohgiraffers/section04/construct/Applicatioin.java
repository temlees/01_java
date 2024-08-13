package main.java.com.ohgiraffers.section04.construct;

public class Applicatioin {
    public static void main(String[] args) {

        //클래스명 변수명 = new 쿨래스명();

        /*
        * 생성자란 ?
        * 인스턴스를 생성할 때 초기 수행할 명령이 있는 경우 미리 작성해두고
        * 인스턴스를 생성할떄 호출된다. 생성자 함수에 매개변수가 없는 생성자를
        * 기본생성자라고하며, 기본생성자는 컴파일러에 의해 자동으로 추가되기 때문에
        * 명시적으로 작성하지 않았다
        * 인스턴스 생성시 별도로 수행명령이 없어서 아무것도 작성하지 않았다
        * */

        //기본생성자 호출
         User user1 = new User();
        System.out.println(user1.getInformation());

        //전체필드 초기화 생성자 호출
        User user2 = new User("user01","pass01","홍길동",new java.util.Date());
        System.out.println(user2.getInformation());

        //id pwd를 매개변수로 전달 받는 생성자 호출
        User user3 = new User("user02","pass02");
        System.out.println(user3.getInformation());
    }
}
