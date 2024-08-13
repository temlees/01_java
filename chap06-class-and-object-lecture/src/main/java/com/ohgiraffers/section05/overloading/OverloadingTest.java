package main.java.com.ohgiraffers.section05.overloading;

public class OverloadingTest {

    //오버로딩에 대해 이해

    /*
    * 오버로딩의 사용 이유
    * 매개변수의 종류별로 메소드 내용을 다르게 작성해야 하는 이유가
    * 종종 있다. 이 때 동일한 기능의 메소드를 매개변수에 따라 다르게
    * 이름을 정의하면 복잡하고 관리하기 어려워 진다.
    * 규모가 작은 프로그램의 경우는 정도가 덜 하지만 거대해지면
    * 메소드 또한 관리하기 매우 어렵다 따라서 동일한 이름으로 다양한 종류의
    * 매개변수에 따라 처리해야하는 여러 메소드 관리를 위해
    * 사용 하는 기술을 오버로딩이라고 한다.
    *
    * 똑같은 기능에 매개변수만 다르게 설정한 것 ex) println()
    *
    * */
    public static void main(String[] args) {
        System.out.println();
    }
    
    /*
    * 오버로딩의 조건
    * 동일한 이름을 가진 메소드의 파라미터 선언부에 매개변수 터입, 갯수
    * 순서응 다르게 작성하여 한 클래스 내에 동일한 이름의 메소드를
    * 여러개 작성할 수 있도록 한다.
    * 메소드의 시그니쳐가 다르면 다른 메소드로 인식하기 때문이다.
    * 즉, 시그니쳐 중 메소드 이름은 동일해야 하기 때문에 파라미터 선언부가
    * 다르게 작성되어야 오버로딩이 된다.
    * 
    * 시그니쳐 ? 메소드의 메소드명과 파라미터 선언부 부분
    * public void method(int num){} -> method(int num)부분
    * 
    * 
    * */

    public void test(){

    }

    public void test(int num){

    }

    public void test(int num,String name){

    }
    public void test(int num,String name,int age){

    }
    public void test(int num,String name,int age,boolean isTrue){

    }
}
