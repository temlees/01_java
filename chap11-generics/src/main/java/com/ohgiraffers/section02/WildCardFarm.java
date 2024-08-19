package main.java.com.ohgiraffers.section02;

public class WildCardFarm {

    //매개변수로 전달받는 토끼농장을 구현할 때 사용할 타입 변수에 대해
    //제한할 수 있다.

    //래빗팜이 가질수 있는 타입 다 가능
    public void anyType(RabbitFarm<?> farm){

        farm.getAnimal().cry();

    }

    //래빗팜이 가질수 있는 타입중 bunny를 상속받은 것 가능
    public void extendsType(RabbitFarm<? extends Bunny> farm){}

    
    //자신을 포함해서 부모만 들어올 수 있다
    public void superType(RabbitFarm<? super Bunny> farm){
        farm.getAnimal().cry();
    }
}
