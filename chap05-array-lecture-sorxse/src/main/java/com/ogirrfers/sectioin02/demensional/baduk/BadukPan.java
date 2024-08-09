package main.java.com.ogirrfers.sectioin02.demensional.baduk;

import java.util.Scanner;

public class BadukPan {
    
    /*
    * 19 * 19 크기의 바둑판을 생성
    * 사용자로부터 입력을 받아 번갈아 바둑돌을 놓는 간단한 게임 구현
    * */

    public static void main(String[] args) {

        //바둑판 배열 만들기
        char[][] badukBoard = new char[19][19];

        for (int i = 0; i < 19 ; i++) {
            for (int j = 0; j < 19 ; j++) {
                badukBoard[i][j] = '.';

            }
        }
        //바둑판을 출력
        print(badukBoard);

        Scanner sc = new Scanner(System.in);

        char currentPlayer = '●';

        while (true){

            System.out.println("행을 입력해주세요(1~19) :");
            int row = sc.nextInt();
            System.out.println("열을 입력해 주세요 (1~19):");
            int col = sc.nextInt();

            //위치 유효성 확인
            if(row >=1 && row<=19 && col >=1 && col<=19 && badukBoard[row-1][col-1] =='.'){
                        badukBoard[row-1][col-1] = currentPlayer;

                        //다음 플레이어에게 넘김
                if(currentPlayer =='●'){
                    currentPlayer = '○';
                }else{
                    currentPlayer = '●';
                }
                print(badukBoard);
            }else{
                System.out.println("잘못된 위치입니다");
                continue;
            }
        }

    }

    public static  void print(char [][] board){

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(board[i][j] +" ");
            }
            System.out.println();
        }
    }


}
