package main.java.com.ogirrfers.sectioin02.demensional.baduk;

import java.util.Arrays;
import java.util.Scanner;

public class Baduk2 {
    public static void main(String[] args) {
        //1. 19 19 크기의 바둑판 생성
        //2. 사용자로 부터 입력을 받아 번갈아 가며 바둑을 놓는 게임

        char[][] baduk = new char[19][19];

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                baduk[i][j] = '.';
            }
        }
        test(baduk);

        char current = '●';

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("행 입력 :");
            int row = sc.nextInt();
            System.out.println("열 입력");
            int crow = sc.nextInt();
            if(row >=1 && row<=19 && crow >=1 && crow<=19 && baduk[row-1][crow-1]=='.' ) {
                  baduk[row-1][crow-1]= current;

                  if (current == '●'){
                      current ='○';

                  }else current = '●';


            }else System.out.println("잘못된 위치 입니다");

            test(baduk);

        }


    }//main

    public static void test(char[][] board) {

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }

}//class
