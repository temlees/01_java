package main.java.com.ogirrfers.secition01.array.question;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        /*  -- 심화
         * 배열의 길이와 배열의 요소들을 스캐너를 통해 입력받아 정수형 배열을 만든 후,
         * 배열에서 중복된 값을 모두 제거한 후
         *  남은 값을 오름차순으로 출력하는 프로그램을 작성하세요.
         * 만약 배열의 길이가 0이면 "빈 배열입니다."를 출력하세요.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("배열의 길이 입력");
        int  high = sc.nextInt();
        int [] arr = new int[high];

        System.out.println("배열의 요소");
        for (int i = 0; i <high; i++) {
            arr[i] =sc.nextInt();
        }


        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int [] arrNew = new int [high];


        for (int i = 0; i <arr.length ; i++) {
            if(i==0 ||arr[i] != arr[i-1]){
                arrNew[i] = arr[i];
                System.out.println(arrNew[i]);
            }

        }

        System.out.println(Arrays.toString(arrNew));

    }




}

