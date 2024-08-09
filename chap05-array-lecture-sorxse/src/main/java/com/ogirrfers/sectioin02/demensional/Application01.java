package main.java.com.ogirrfers.sectioin02.demensional;

public class Application01 {
    public static void main(String[] args) {
        /*
        *
        * 다차원 배열
        * 다차원 배열은 2차원 이상의 배열을 의미
        *
        * 배열의 인덱스마다 또다른 배열의 주소를 보관하는 배열을 의미한다
        * 즉, 2차원 배열은 1차원 배열 여러개를 하나로 묶어서 관리하는 배열을 의미
        * 더 많은 차원의 배열을 사용할 수 있지만,일반적으로 2차원 배열보다 높은 차원의 배열은
        * 사용반도가 적다
        * */

        /*
        * 2차원 배열을 사용하는 방법
        * 1. 배열의 주소를 보관할 변수 선언 (stack)
        * 2. 여러개의 1차원 배열의 주소를 관리하는 배열을 생성(heap)
        * 3. 각 인덱스에서 관리하는 배열을 할당(heap)하여 주소를 보관하는 배열에 저장
        * 4. 생성한 여러개의 1차원 배열에 차례로 접는해서 사용.
        * */

        int[][] iarr1;
        int iarr2[][];
        int[] iarr3[];

        //배열의 주소를 관리하는 배열의 길이는 정수형으로 반드시 크기를 지정 헤 주어야 한다.
        iarr1 = new int[3][];

      //  iarr2 = new int [][];
      //  iarr3 = new int[][3];

        iarr1[0] = new int[5];
        iarr1[1] = new int[5];
        iarr1[2] = new int[5];

        iarr2 = new int[3][5]; //주소를 관리하는 배열3 각각5개의 주소를 가지는 배열

        //0번 인덱스에 접근 후 값 출력
        for (int i = 0; i <iarr1[0].length ; i++) {
            System.out.print(iarr1[0][i] + " ");
        }
        System.out.println();

        for (int i = 0; i <iarr1[1].length; i++) {
            System.out.print(iarr1[1][i]+ " ");
        }
        System.out.println();

        for (int i = 0; i <iarr1[2].length; i++) {
            System.out.print(iarr1[2][i]+ " ");
        }
        System.out.println();

        //iarr1.length heap영역의 주소배열의 길이 int[3][] 이면 3이 길이가 된다
        
        for (int i = 0; i <iarr1.length; i++) {
            for (int j = 0; j <iarr1[i].length; j++) {
                System.out.print(iarr1[i][j] + " ");
            }
            System.out.println();
        }
    }

}
