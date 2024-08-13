package main.java.com.ohgiraffers.section03.dto;

public class Application {
    public static void main(String[] args) {

        /*
        * 캡술화에 원칙에는 어긋나지만 다른 목적을 가진
        * 클래스와 객체를 추상화 하는 기법이 있다
        * 행위 위주가 아닌 데이터를 하나로 뭉치기 위한객체
        * data transfer object 이다
        * 이러한 객체를 설계할 때는  행위가아닌  데이터가 위주이며
        * 캡슐화의 원칙을 준수하여 모든 필드를 private로 직접접근을 막고
        * 각 필드값을 변경하거나 반환하는 메소드를 세트로 미리 작성해둔다
        * 어떤것을 쓸지 모르니 미리 다 준비 해두는 종합세트이다
        * private 필드와 필드값을 수정하는 설정자(setter)
        * 필드에 접근하는접근자 getter 로 구성된다
        * 주로 계층간 데이터를 주고 받을 목적으로 사용된다.
        * */
        MemberDTO member = new MemberDTO();
        member.setName("홍길동");
        System.out.println("member.getName() = " + member.getName());
        member.setAge(20);
        System.out.println("member.getAge() = " + member.getAge());
    }
}
