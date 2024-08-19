package main.java.com.ohgiraffers.section02;

public class RabbitFarm<T extends Rabbit>{
    //Rabbit 포함한 자식들만 올 수 있음
    //public class RabbitFarm<T extends Rabbit & Animal>{
    //&연산자 쓰면 뒤에 interface가능

    private T animal;

    public RabbitFarm() {
    }

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
