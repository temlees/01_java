package main.java.com.ohgiraffers.understand;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        /*
        * 사용자에게 숫자 두개와 연산자를 입력 받습니다.
        * 입력된 연산을 수행하여 결과를 출력합니다
        * /는 0으로 할 수 없기 때문에 예외처리를 해주시고
        * 사용자가 잘못된 연산자를 입력하면 예외처리를 해주세요.
        * */
          Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자 :");
        int no1 = sc.nextInt();
        System.out.println("두번째 숫자 :");
        int no2 = sc.nextInt();
        sc.nextLine();
        System.out.println("연산자 :");
        String a = sc.nextLine();
        int result;

        try {


            switch (a) {
                case "*":
                    result = no1 * no2;
                    break;
                case "/":
                    try {
                        throw new Exception("에러발생");
                    } catch (Exception e) {
                        System.out.println("오류발생");
                    }
                    ;
                    break;
                case "+":
                    result = no1 + no2;
                    break;
                case "-":
                    result = no1 - no2;
                    break;
            }

        }catch (Exception e) {

        }



    }
}
