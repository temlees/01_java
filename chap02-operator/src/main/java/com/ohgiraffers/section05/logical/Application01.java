package main.java.com.ohgiraffers.section05.logical;

public class Application01 {
    public static void main(String[] args) {

        /*
         * 논리 연산자
         * 논리값을 취급하는 연산자
         *
         * 논리연산자의 종류
         * 1. 논리 연결 연산자  :  두 개의 피 연산자를 가지는 이항 연산자이면,
         * 연산자의 결함 방향은 왼 -> 오른쪽 이다.  두개의 논리식을 판단하여 참과거짓을 판단한다
         * 1-1. &&(AND논리) : 두 개의 논리식 모두 참일 경우 참 반환 , 한 개라도 거짓이면 거짓
         * 1-2 || (OR논리) :  두 개의 논리식 중 하나라도 참일 경우 참을 반환, 한 개라도 거짓일 경우 거짓반환
         * 2.논리 부정 연산자 :  피 연산자가  하나인 단항 연산자
         * 2-1 !(NOT 논리) : 논리식의 결과가 참이면 거짓,거짓이면 참 반환.
         * */

        System.out.println("true 와 true의 논리 and 연산 : " + (true && true));
        System.out.println("true 와 false의 논리 and 연산 : " + (true && false));
        System.out.println("true 와 true의 논리 or 연산 : " + (true || true));
        System.out.println("true 와 false 논리 or 연산 : " + (true || false));

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        System.out.println("---------------------------");
        System.out.println("a가 b보다 작으면서 c가 d보다 작은지 확인 : " + ((a < b) && (c < d)));
        System.out.println("a가 b보다 작으면서 c가 d보다 큰지확인 : " + ((a < b) && (c > d)));
        System.out.println("a가 b보다 크면서 c가 d보다 작은 확인 : " + ((a > b) && (c < d)));
        System.out.println("a가 b보다 크면서 c가 d보다 큰지 확인 : " + ((a > b) && (c > d)));

        System.out.println("a가 b보다 작거나 c가 d보다 작은지 확인" + ((a < b) || (c < d)));
        System.out.println("a가 b보다 작거나 c가 d보다 큰지 :" + ((a < b) || (c > d)));
        System.out.println("a가 b보다 크거나 c가 d보다 작은 확인 : " + ((a > b) || (c < d)));
        System.out.println("a가 b보다 크거나 c가 d보다 큰지 확인 : " + ((a > b) || (c > d)));
    }//main
}//class
