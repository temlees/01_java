package main.java.com.ohgiraffers.section02.run;

import main.java.com.ohgiraffers.section02.*;

public class Application02 {
    public static void main(String[] args) {
        
        /*
        * 와일드 카드
        * 제네릭 클래스 타입의 객체를 메소드의 매개변수로
        * 받을 때, 그 객체의 타입 변수를 제한할 수 있다.
        * 
        * <?> : 제한 없음
        * <? extends Type>: 와일드카드의 상한제한  본인포함
        * <? super Type> : 와일드 카드 하한 제한   본인포함
        * */

        WildCardFarm wildCardFarm = new WildCardFarm();

        //1. anyType
        wildCardFarm.anyType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.anyType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<>(new DrunkenBunny()));

        //extends Type
        wildCardFarm.extendsType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.extendsType(new RabbitFarm<>(new DrunkenBunny()));

        //superType
        wildCardFarm.superType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.superType(new RabbitFarm<>(new Rabbit()));
        //wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
    }
}
