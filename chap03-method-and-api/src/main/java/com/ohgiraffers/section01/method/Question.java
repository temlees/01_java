package main.java.com.ohgiraffers.section01.method;

public class Question {
    public static void main(String[] args) {
        /*
        *  두 수를 매개변수로 받아 더한값을 반환하는 메서드
         *  두 수를 매개변수로 받아 뺀값을 반환하는 메서드
         *  두 수를 매개변수로 받아 곱한값을 반환하는 메서드
         *  두 수를 매개변수로 받아 나눈값을 반환하는 메서드
        *
        * */
        Question question = new Question();

      //  question.add(5,10);
        System.out.println(question.add(5,10));
        System.out.println(question.minus(5,10));
        System.out.println(question.gop(5,10));
        System.out.println(question.nanum(5,10));

    }//main
    public int add(int a, int b){

        return a+b;
    }


    public int minus(int a, int b){
        return a-b;
    }


    public int gop(int a, int b){
        return a*b;
    }

    public int nanum(int a, int b){
        return a/b;
    }

}//class
