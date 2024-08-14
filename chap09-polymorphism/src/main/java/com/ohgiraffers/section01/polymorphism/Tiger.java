package main.java.com.ohgiraffers.section01.polymorphism;

public class Tiger extends  Animal{
    @Override
    public void eat() {
        System.out.println("호랑이가 고기를 먹는다");
    }

    @Override
    public void run() {
        System.out.println("달려간다 호랑이");
    }

    @Override
    public void cry() {
        System.out.println("호랑이가 울부짖습니다");
    }
    
    public void bite(){
        System.out.println("호랑이가 물어 뜯습니다");
    }
}
