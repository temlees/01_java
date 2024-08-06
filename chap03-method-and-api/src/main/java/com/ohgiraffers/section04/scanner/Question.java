package main.java.com.ohgiraffers.section04.scanner;

import java.util.Random;

public class Question {

    /*
     *  - 100~ 100 사이의 난수를 발생시켜서 인자로 전달하면
     * 매개변수가 양수면서 짝수면 x 는 양수이면사 짝수 입니다.양수면서 홀수면 x는 양수면서 홀수 입니다
     * 음수면서 짝수면 x는 음수면서 짝수입니다. 음수면서 홀수면 x는 음수면서 홀수입니다
     * 를 반환하는 메소드를 다른클래스에 생성해 메인메서드에서 호출 후 화면에 출력
     * (static/non-static 한번씩)
     *
     * */
    public static void main(String[] args) {
        Random rd = new Random();
        int a = rd.nextInt(201) - 100;

        // String result1 = (a>0 && a%2==0)?"양수이면서 짝수입니다":"양수이면서 홀수입니다";
        //  System.out.println(a+"는" + result1);

        Question q = new Question();

        if (a!=0){
            q.jak(a);
        }else System.out.println("0입니다");
     


    }//main

    public void jak(int a) {
        //System.out.println(a+"는"+((a>0 && a%2==0)?"양수이면서 짝수입니다":"양수이면서 홀수입니다"));
        String a1 = (a > 0) ? "양수" : "음수";
        String a2 = (a % 2 == 0) ? "짝수" : "홀수";
        System.out.println(a + "는" + (a1 + a2));
    }// jak()


}
