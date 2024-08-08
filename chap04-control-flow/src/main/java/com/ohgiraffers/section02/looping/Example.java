package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

    }//main

    public void so (){
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 값 입렵");
        int first = sc.nextInt();
        System.out.println("두번째 값 입력");
        int second = sc.nextInt();

        for (int i = first; i<=second;i++){
            boolean isTrue = true;
            for(int j = 2 ;j<i;j++){
                if(i % j == 0){
                    isTrue = false;
                    break;
                }
            }
            if(isTrue==true){
                System.out.println(i);
            }

        }//큰 for문
    }
    //구구단 만들기
    public void ququ(){
        for (int i = 2; i<= 9; i++){
            for(int j =1; j<=9; j++){
                System.out.println(i+ "*"+ j +"=" +i*j);

            }
        }
    }//ququ



}
