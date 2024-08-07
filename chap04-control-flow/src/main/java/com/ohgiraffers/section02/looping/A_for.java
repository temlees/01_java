package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {

    public void testSimpleFor() {
        /*
            반복문
        * for(초기식; 조건식; 증감식){
        *   조건을 만족하는 경우 수행할 구문(반복할 구문);
        * }
        * */

        //1부터 10 까지 1씩 중가시키면서 i 값 출력
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public void testExample() {
        // 1~10까지의 합계
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i == 10) {
                System.out.printf(i + "=");
            } else
                System.out.printf(i + "+");
            sum += i;
        }
        System.out.println(sum);

    }//testExample

    public void gugudan() {

        /*
         * 키보드로 2~9 사이의 구구단을 입력 받아
         * 2~9 사이인 경우 해당 단의 구구단을 출력한다
         * 그렇지 않은경우 "반드시 2~9 사이의 양수를 입력해야 합니다 출력"
         * */
        Scanner sc = new Scanner(System.in);
        System.out.println("단 수를 입력하시오");
        int dan = sc.nextInt();
        int result = 0;

        if (dan >= 2 && dan <= 9) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan + " * " + i + " = " + dan * i);
            }
        } else {
            System.out.println("반드시 2~9 사이의 양수를 입력해야합니다");
        }
    }

    public void test2() {
        /*
         * 숫자 두개를 입력받아 작은 수에서 큰수까지의 합계를 구해주세요
         * */
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 1 입력 : ");
        int a = sc.nextInt();
        System.out.println("숫자 2 입력 : ");
        int b = sc.nextInt();
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int result = 0;

        for (int i = min; i <= max; i++) {
            result += i;
        }
        System.out.println(min + "~" + max + " 합은 " + result);
    }//test2
        /*
        * 주어진 숫자 범위 내에서 소수를 찾아 출력하는 프로그램을 작성하봅시다.
          사용자로부터 시작 숫자와 끝 숫자를 입력받습니다.
        * 프로그램은 해당 범위 내의 모든 소수를 찾아서 출력합니다.
          소수 : 1과 자기 자신을 제외한 수로 나누어떨어지지 않는 수
        * */
    public void test3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("시작 숫자 입력");
        int first = sc.nextInt();
        System.out.println("끝 숫자 입력");
        int second = sc.nextInt();


  for (int i = first; i <= second; i++) {

      boolean isTrue = true;
      for(int j = 2; j < i; j++){
          if (i % j== 0){
              isTrue = false;
              break;
          }
      }
      if(isTrue == true){
          System.out.println(i);
      }
  }

    }//test3




}//class
