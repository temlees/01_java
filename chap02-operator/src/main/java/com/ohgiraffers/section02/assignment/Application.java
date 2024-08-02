package main.java.com.ohgiraffers.section02.assignment;

public class Application {
    public static void main(String[] args) {
        /*
        * 대입 연산자와 산술 복합 대입연산자
        * 
        * = : 왼쪽의 피 연산자에 오른쪽의 피연산자를 대입한다
        * += : 왼쪽의 피연산자에 오른쪽의 피연산자를 더한 결과 대입
        * -= : 왼쪽의 피연산자에 오른쪽의 피연산자를 뺀 값을 대입
        * *= : 왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 결과값을 대입
        * /= : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 결과 값을 대입
        * %= : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 나머지 결과 대입
        * */

        int num = 12;
        System.out.println(num);
        System.out.println("num = " + num);

        // 3증가
        num += 3;
        System.out.println("num = " + num);
        
        //5로 나눈 나머지값
        num %= 5;
        System.out.println("num = " + num);

        System.out.println("------------");
        num = 12;
        //num = num +0.1;
        num *= 4.1;
        System.out.println("num = " + num);




    }//main
}//class
