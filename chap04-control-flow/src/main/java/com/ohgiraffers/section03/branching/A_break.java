package main.java.com.ohgiraffers.section03.branching;

public class A_break {

    public void testBreak() {
        /*
         * brek 문은 반복문 내에서 사용한다.
         * 해방 반복문을 빠져나올 때 사용하며,반복문의 조건문 판단 결과와
         * 상관 없이 반복문을 빠져나올 때 사용
         * 단 switch는 반복문이 아니지만 사용된다.
         * */

        // break 활용하여 무한루프 만들어 1~100까지 합계 구하기.
        int sum = 0;
        int i = 1;
        while (true) {
            sum += i;

            if (i == 100) {
                break;
            }
            i++;

        }
        System.out.println("1부터 100까지의 합은 ?" + sum);
    }

    public void test2() {

        // break는 모든 반복문을 종료하는 것이 아닌 자신에게 가장 인접한 반복문실행만 멈춤

        //구구단  2~9 단까지 출력
        //수가 5보다 크면 생략
     label:  for (int dan = 2; dan < 10; dan++) {

            for (int su = 1; su < 10; su++) {

                if (su > 5) {
                    break label;
                }
                System.out.println(dan + "*" + su + "=" + dan * su);

            }
            System.out.println();
        }
    }
}//class
