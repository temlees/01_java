package main.java.com.ogirrfers.secition01.array.question;

import java.util.Random;

public class Question {
    public static void main(String[] args) {
        // 트럼프 카드를 랜덤으로 한장 출력해보자 52장

        Random rd =  new Random();

        String [] num = {"jack","queen","king","4","5","6","7","8","9","10"};
        String [] shape = {"dia","heart","club","spade"};

            String result1 ="";
            String result2 ="";

        for (int i = 0; i <10 ; i++) {
            result1 = num[(int)(Math.random()*num.length)];
            result2 = shape[(int)(Math.random()*shape.length)];

            System.out.println(result1+"  "+result2);
        }











    }
}
