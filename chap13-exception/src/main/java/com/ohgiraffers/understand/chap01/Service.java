package main.java.com.ohgiraffers.understand.chap01;

import java.util.ArrayList;
import java.util.Scanner;

public class Service {

    UserDTO userDTO = new UserDTO();
    Scanner sc = new Scanner(System.in);
    BankDB bankDB = new BankDB();



    public void deposit(){
            System.out.println("얼마를 입금하시겠습니까?");
            bankDB.store(sc.nextInt());



    }//deposit

    public void withdraw(){
        System.out.println("얼마를 출금하시겠습니까?");
        int amount = sc.nextInt();
        bankDB.store(amount *-1);


    }//deposit

    public void view(){
        bankDB.findView();
    }//
}
