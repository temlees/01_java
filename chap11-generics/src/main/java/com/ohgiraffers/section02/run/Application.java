package main.java.com.ohgiraffers.section02.run;

import main.java.com.ohgiraffers.section02.Bunny;
import main.java.com.ohgiraffers.section02.DrunkenBunny;
import main.java.com.ohgiraffers.section02.Rabbit;
import main.java.com.ohgiraffers.section02.RabbitFarm;

public class Application {
    public static void main(String[] args) {

        /*
        * 제네릭 클래스 작성시 extends 키워드
        * 특정 타입만 사용하라고 제한을 걸 수 있다.
        *
        * */

        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();


        //타입이 보정되어 있기 때문에 타입형변환없이 사용가능
        //이 부분은 Rabbit이라는 클래스의 새 인스턴스를 생성하는 코드입니다
        // . Rabbit 클래스는 아마도 Animal 클래스 또는 인터페이스를 상속하거나
        // 구현하고 있을 것입니다.
        // 그래서 new Rabbit()은 Animal 타입의 객체로 간주될 수 있습니다.
        farm4.setAnimal(new Rabbit());
        farm4.getAnimal().cry();

        farm5.setAnimal(new Bunny());
        farm5.getAnimal().cry();

        farm6.setAnimal(new DrunkenBunny());
        farm6.getAnimal().cry();
    }
}
