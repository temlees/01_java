package main.java.com.ohgiraffers.section04.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass {


    //상속한 메소드가 예외처리를 했어도
    //오버라이드 해서 예외없이 재정의 가능

    //정상
/*    @Override
    public void method() {

    }*/

    //정상
  /*  @Override
    public void method() throws IOException {
        super.method();
    }*/

    //부모의 예외보다 상위 예외로는 할 수 없다.
    //Exception이 IOException의 상위 클래스이기 때문이다.
/*    @Override
    public void method() throws Exception{}*/

    //더 하위로는 할 수 있다(즉 더 구체적인 상황)
    @Override
    public void method() throws FileNotFoundException {}
}//clas
