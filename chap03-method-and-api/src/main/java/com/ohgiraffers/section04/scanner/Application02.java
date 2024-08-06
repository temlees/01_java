package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {
        /*
         * nextLine() 공백을 포함한 한줄을 입력 개행문자 전까지 읽어서 반환
         * next() :  공백문자나 개행문자 전 까지 읽어서 반환(공백문자 포함 x)
         * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("값을 입력해주세요");
        String greeting = scanner.nextLine();
        System.out.println(greeting);

        System.out.println("두번째 값을 입력해주세여");
        String greeting2 = scanner.next();
        System.out.println(greeting2);
    }


}
