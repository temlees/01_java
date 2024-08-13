package main.java.com.ohgiraffers.question;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("학년 입력 :");
        int a= sc.nextInt();
        System.out.println("반 입력 :");
        int b= sc.nextInt();
        System.out.println("이름 입력 :");
        sc.nextLine();
        String c = sc.nextLine();
        System.out.println("키 입력 :");
        double d = sc.nextDouble();
        sc.nextLine();
        System.out.println("성별 입력 :");
        char e = sc.nextLine().charAt(0);

        StudentVO vo = new StudentVO();
        vo.printInformation(a,b,c,d,e);



    }


}
