package main.java.com.ogirrfers.secition01.array;

public class Application03 {
    public static void main(String[] args) {
        //heap영역은 값이 없으면 존재할 수 없음 초기화 필요

        /*
        * 값의 형태별 기본값
        * 정수 : 0
        * 실수 :0.0
        * 논리 : false
        * 문자 :\u0000
        * 참조 : null
        * */

        int [] iarray = new int [5];
        for (int i = 0; i < iarray.length; i++) {
            System.out.println("iarray[" + i + "] = " + iarray[i]);

        }

        /*
        * 자바에서 기본 값 외의 값으로 초기화를 하고싶은 경우 블럭을 이용한다
        * 블럭을 사용하는 경우에는 new 를 사용하지 않아도 되며, 값의 갯수만큼
        * 자동으로 크기가 설정된다.
        * */
        int [] iarray2 =  {11,22,33,44,55};
        int [] iarray3 = new int []{11,22,33,44,55};

        System.out.println("iarray2 = " + iarray2.length);
        System.out.println("iarray3 = " + iarray3.length);

        //문자열도 배열로 사용할 수 있다.
        String [] sarr = {"apple","banana","grape","orrange"};

        for (int i = 0; i < sarr.length ; i++) {
            System.out.println("sarr[" + i + "] = " + sarr[i]);
        }
    }
}
