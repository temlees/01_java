package main.java.com.ohgiraffers.section03.branching.question;

import java.util.Scanner;

public class Question {
    /*
     * 자판기를 만들기
     * 자판기가 파는 음료는 사이다(500) 콜라(600) 환타 700 박카스1000 핫식스 1500
     * 잘못된 음료수가 선택되면 다시 받아야한다
     *
     * 음료수를 선택하면 계산 여부를 물어본후
     * 계산을 고르면 총금액과 고른 음료수를 출력해 주어야한다.
     * 예)
     * 음료를 선택 해주세여:
     * 사이다
     * 사이다를 선택하셨습니다
     * 계산하시겠습니까 ?
     * 네                      아니오
     * 총 상품은 사이다         음료를 더 선택 해주세요
     * 총금액은 500원             콜라
     * */

    public void quest() {
        Scanner sc = new Scanner(System.in);
        String drink = "";
        int price = 0;
        String q = "";
        System.out.println("음료 선택 : ");

        while (!q.equals("네")) {
            if(q.equals("아니오")){
                System.out.println("음료 더 선택해주세요 : ");
            }
            String drink1 = sc.nextLine();
            switch (drink1) {
                case "사이다": price += 500; drink += "사이다 "; break;
                case "콜라":price += 600; drink +="콜라"; break;
                case "환타": price += 700; drink +="환타"; break;
                case "박카스": price += 1000; drink +="박카스"; break;
                case " 핫식스": price += 1500; drink +="핫식스"; break;
            }

            System.out.println( drink + "를 선택히셨습니다.");
            System.out.println("계산하시겠습니까?");
            q = sc.nextLine();

           
        }

        System.out.println("총상품은 " + drink);
        System.out.println("총 금액은 " + price + "입니다");

    }


}// class
