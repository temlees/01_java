package main.java.com.ohgiraffers.section02.encapsulation.problem1;

public class Application {

    public static void main(String[] args) {

        //필드에 직접 접근하는 경우 발생할 수 있는 문제점(1)

        //필드에 올바르지 않는 값이 들어가도 통제가 불가능하다.
        // -200같이 올바르지 않은 값이 들어와도 직접 접근하면 값이 들어간다

        Monster monster1 = new Monster();
        monster1.name = "두치";
        monster1.hp = 200;

        System.out.println("Monster1 name: " + monster1.name);
        System.out.println("Monster1 hp: " + monster1.hp);

        Monster monster2 = new Monster();
        monster2.name ="뿌꾸";
        monster2.hp = -200;

        System.out.println("Monster2 name: " + monster2.name);
        System.out.println("Monster2 hp: " + monster2.hp);

        Monster monster3 = new Monster();
        monster3.name = "드라큘라";
        monster3.setHp(200);

        System.out.println("Monster3 name: " + monster3.name);
        System.out.println("monster3 hp: " + monster3.hp);

        Monster monster4 = new Monster();  //래퍼런스 변수 만들기
        monster4.name ="프랑켄";
        monster4.setHp(-1000);
        System.out.println("Monster4 name: " + monster4.name);
        System.out.println("monster4 hp: " + monster4.hp);
    }
}
