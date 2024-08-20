package main.java.com.ohgiraffers.understand.chap01;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Service service = new Service();
while (true) {
    System.out.println("메뉴 선택");
    System.out.println("계좌 입금을원하시면 1 , 출금을 원하시면 2 , 조회를 원하시면 3,  종료를 원하시면 4  ");
    int no = sc.nextInt();
    switch (no) {
        case 1:
            service.deposit();
            break;
        case 2:
            service.withdraw();
            break;
        case 3:
            service.view();
            break;
        case 4:
            return;
    }
    System.out.println("프로그램종료");
}

    }//main
}//class
