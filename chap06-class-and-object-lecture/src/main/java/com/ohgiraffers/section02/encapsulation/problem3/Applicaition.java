package main.java.com.ohgiraffers.section02.encapsulation.problem3;

public class Applicaition {
    public static void main(String[] args) {

        //필드에 직접 접근시 생기는 문제점(3)


        //monster 객체는 Monster클래스의 this.kind와 같은 주소를 가진다
        Monster monster = new Monster();
        monster.setInfo("드라큘라");
        monster.setHp(100);

        Monster monster2 = new Monster();
        monster2.setInfo("프랑켄");
        monster2.setHp(200);

        System.out.println(monster.getInfo());
        System.out.println(monster2.getInfo());

        Monster monster3 = new Monster();
        monster3.kind = "두치";
        monster3.hp = -500;
        System.out.println("monster3.kind: " + monster3.kind);
        System.out.println("monster3.hp: " + monster3.hp);
    }

}
