package main.java.com.ohgiraffers.section02.encapsulation.problem4;

public class Application {

    public static void main(String[] args) {

        Monster monster = new Monster();
        monster.setKind("드라큘라");
        monster.setHp(100);
        System.out.println("monster "+monster.getInfo());

        Monster monster2 = new Monster();
        //클래스 멤버 중(필드에 접근을 제한 해 놨기 때문에 직접 접근 불가)
        // 이것이 캡슐화 이다.
      //  monster2.kind = "홍길동";
      //  monster2.hp =20;
        //객체란? new 연산자를 통해 heap에 할당된 공간 ,인스턴스
    }
}
