package main.java.com.ohgiraffers.section01.polymorphism.section04.use2;

public class Dicer {

    private int currentPostion;

    public void move(int diceNumber){
        this.currentPostion += diceNumber;
    }

    public void throwDice(Dice dice){

        int diceNumber = dice.getNumber();
        move(diceNumber);
        System.out.println("현재위치는 "+ currentPostion+" 입니다");
    }
}
