package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_while {

    public void testsimpleWhile() {
        /*
         * [while 표현식]
         *
         * 초기식;
         * while(조건식){
         * 조건을 만족하는 경우 수행할 구문;
         * 증감식;
         * }
         * */

        //1~10까지 증가
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }//while

    }//testsimpleWhile

    public void testExample1() {
        //입력한 문자열의 인덱스를 이용하여 문자 하나씩 출력

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        /*
         * charAt() : 문자열에서 인덱스에 해당하는 문자를 char형으로 변환
         * length() : String 클래스의 메소드로 문자열의 길이를 int 형으로 변환
         * index는 0부터 시작하고 마지막 인덱스는 항상 길이보다 하나 작은 숫자를 가짐.
         *
         * */
        System.out.println("=======for문=======");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            System.out.println(i + " : " + ch);
        }
        System.out.println("=====while문======");
        int index = 0;
        while (index < str.length()) {

            char ch = str.charAt(index);

            System.out.println(index + " : " + ch);
            index++;
        }
    }

    public void testExample2() {
        //정수 하나를 입력받아 1부터 입력한 정수까지의 합계
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력");
        int a = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= a) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }

    public void testWhileExample3(){
        //중첩 while을 이용한 구구단 출력
        int dan = 2;
        while(dan<=9){
            int su = 1;
            while (su<=9){
                System.out.println(dan+"  *  "+su +"  =  "+ dan*su);
                su++;
            }
            System.out.println();
            dan++;
        }
    }

}//class
