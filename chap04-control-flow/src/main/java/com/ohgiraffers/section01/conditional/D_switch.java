package main.java.com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {

    public void testSwitch(){
        /*
        * switch문 표현식
        * switch(비교할 변수){
        *  case 비교값 1 : 일치할경우 구문;break;
        * *  case 비교값 2 : 일치할경우 구문;break;
        * *  case 비교값 3 : 일치할경우 구문;break;
        * *  default : case에 모두 해당x 구문;break;
        * }
        *
        * 여러 개의 비교값 중 일치하는 조건에 해당하는 로직을 실시
        * iff else 와 비슷
        * Switch문으로 비교 가능한 값은 정수 문자 문자열
        * 실수와 논리는 비교 불가
        * 또한 정확하게 일치하는 경우에만 비교할 수 있으며 대소비교 가능
        * case 절에는 사용 불가.
        * */

        // 계산기 만들기
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 정수 입력 : ");
        int first = sc.nextInt();
        System.out.println("두번째 정수 입력 : ");
        int second = sc.nextInt();

        System.out.println("연산 기호 입력 : ");
        char op = sc.next().charAt(0);

        int result = 0;

        switch (op){
            case '+' : result = first + second; break;
            case ' ' : result = first - second; break;
            case '*' : result = first * second; break;
            case '/' : result = first / second; break;
            case '%' : result = first % second; break;
        }
        System.out.println(first + "" + op +""+ second + "= " + result);
    }
    
    public void testVendingMachine(){
        // 자판기를 switch를 이용해서 만들어 보자
        System.out.println("----------Vending machine ----------");
        System.out.println("사이다(500),콜라(600),환타(700), 박카스(1000)");
        System.out.println("------------------------");
        System.out.println("음료를 선택해주세요");
        
        Scanner sc = new Scanner(System.in);
        String selectedDrink = sc.nextLine();
        
        int price = 0;
        
        switch (selectedDrink){
            case "사이다":price = 500;break;
            case "콜라" : price = 600; break;
            case "환타" : price = 700; break;
            case "박카스" : price = 1000; break;
            
        }

        System.out.println(selectedDrink+"를 선택하셨습니다");
        System.out.println(selectedDrink+"는"+price+"입니다");
    }
}//class


