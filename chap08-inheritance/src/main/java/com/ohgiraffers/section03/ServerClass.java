package main.java.com.ohgiraffers.section03;

public class ServerClass extends SuperClass {

    // 메소드 이름을 변경하면 에러가 발생한다
 /*   @Override
    public void method2(int num){
        super.method(num);}*/

    //메소드의 리턴타입이 변경되면 에러가 발생한다.

  /*  @Override
    public int method(int num) {
        super.method(num);
    }*/

    //시그니쳐가 달라도 오류가 발생한다.

 /*   @Override
    public void method(int num,int num2) {
        super.method(num);
    }*/

    //privata 접근자는 접근 불가능

   /* @Override
    public void privateMethod(){}*/

    //final 은 한번 정의된 후 변경이 불가능하다

  /*  @Override
    public final void finalmethod(int num) {
        super.method(num);
    }*/

    //접근제어자는 같거나 더 넓은 범위로만 가능하다

}


