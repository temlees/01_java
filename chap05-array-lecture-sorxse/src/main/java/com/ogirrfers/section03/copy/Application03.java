package main.java.com.ogirrfers.section03.copy;

import java.util.Arrays;

public class Application03 {
    public static void main(String[] args) {

        /*
         * 깊은 복사
         * heap 에 생성된 배열이 가지고 있는 값을
         * 또다를 배열에 복사하는 것
         *
         * 서로 같은값을 가지고 있지만 , 두배열은 서로 다른 배열이기에
         * 하나의 배열을 변경하더라도 다른 배열에 영향을 주지 않는다
         *

         * */

        /*
         * 깊은 복사 방법4가지
         * 1.for문을 이용한 동일 인덱스 값 복사
         * 2.object 의 clone 을 이용한 복사
         * 3.System의 arrayCopy() 를 이용한 복사
         * 4.Array의 copyOf() 를 이용한 복사
         * */

        int []  originArr={1,2,3,4,5};
        print(originArr);

        //for문을 이용한 동일 인덱스값 복사

        int [] copyArr1 = new int[10];
        for (int i = 0; i < originArr.length ; i++) {
            copyArr1[i] = originArr[i];

        }
        print(copyArr1);

        // 2.object 의 clone()을 이용한 복사
        // 오브젝트는 모든 타입의 최상위 타입, 모든 자료형의 부모
        System.out.println(" object clone() : ");
        int [] copyArr2 = originArr.clone();
        print(copyArr2);
        
        //3.System 의 arraycopy()를 이용한 복사.
        System.out.println("arraycopy : ");
        int [] copyArr3 = new int[10];

        //원본 배열, 복사 시작할 인덱스 번호, 복사 받을배열,복사받을 배열의 인덱스번호,원본배열 길이
        System.arraycopy(originArr,0,copyArr3,0,originArr.length);
        print(copyArr3);

        //4. Arrays copyOf() 를 이용한 복사
        //복사할 배열의 크기보다 커도 0으로 채워져서  복사가 가능함
        System.out.println("copyOf() :");
        int [] copyArr4 = Arrays.copyOf(originArr,originArr.length);
        print(copyArr4);

    }//main

    public static void print(int[] iarr){
        System.out.println("iarr: "+ iarr.hashCode());

        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i]+ " ");

        }
        System.out.println();
    }
}
