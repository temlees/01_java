package main.java.com.ogirrfers.secition01.array;

public class Application01 {
    public static void main(String[] args) {


        /*
        * 배열이란 ?
        * 동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도)이다
        * 배열은 heap영역에  new 연산자를 이용하여 할당한다.
        *
        * 배열을 사용하는 이유?
        * 만약 배열을 사용하지 않는다면 변수를 여러개 사용해야한다
        * 1. 연속된 메모리 공간으로 관리할 수 없다.
        * 2.반복문을 이용한 연속처리가 불가능하다.
        * */

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5= 50;

        int sum = 0;

        int [] array = new int[5];

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        for (int i = 0; i < array.length ; i++) {
            sum +=array[i];
        }
        System.out.println(sum);


    }//main
}//class
