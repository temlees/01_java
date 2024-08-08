package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_nestedFor {

    public void gugudan() {
        //for문 안에서 for문을 이용할 수 있다.

        //2~9단까지 쭉 출력.

        for (int dan = 2; dan <= 9; dan++) {
            for (int su = 1; su <= 9; su++) {
                System.out.println(dan + " * " + su + " = " + dan * su);
            }
            System.out.println();
        }
    }//guguan

    public void printUpgrade(){

        //단을 2부터9 까지 증가시킨다
        for (int dan = 2; dan <10 ; dan++) {

            printGuguan(dan);

            System.out.println();

        }
    }//upgrad

    public void printGuguan(int dan){

        for (int su = 1; su <10 ; su++) {
            System.out.println(dan + "*" + su + " = " + dan * su);

        }
    }

    public void printStar(){
        /*
        * 키보드로 정수를 입력받아 해장 정수만큼 한 행에 "*"을 행의 번호개씩
        * 출력 해주세요
        * 예) 정수를 입력하세요 5
        * */
        System.out.println("정수를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }//

    public void rstar(){
        System.out.println("정수를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = a; i >= 1 ; i--) {

            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}//class
