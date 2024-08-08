package main.java.com.ogirrfers.secition01.array;

import java.util.Scanner;

public class Application04 {
    public static void main(String[] args) {

        // 5명의 자바점수를 입력 받아 함계와 평균을 실수로 구하는 프로그램을 만들어 보자.
        Scanner sc = new Scanner(System.in);

        int [] score = new int [5];

        for (int i = 0; i < score.length; i++) {
            System.out.println((i+1)+"번째 학생의 자바 점수를 입력해 주세요 : ");
            score[i]= sc.nextInt();
        }

        double sum = 0.0;
        double avg = 0.0;

        for(int i  = 0; i < score.length; i++){

            sum += score[i];

        }//for
        avg = sum/score.length;
        System.out.println("합계 = " +  sum);
        System.out.println("평균 ="  +  avg);

    }
}
