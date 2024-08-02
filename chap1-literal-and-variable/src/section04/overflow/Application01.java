package section04.overflow;

public class Application01 {
    public static void main(String[] args) {
        //자료형 별 최대 범위를 벗어나는 경우
        /*
        * 1byte는 8개의 bit를 가지고 있음
        * 127을 2진수로 변환하면01111111
        * -128은 2 진수로반환하면10000000
        * */
        byte num1= 127;
        System.out.println("null : " +num1);
        num1++;
        System.out.println("num1 : "+ num1 );

        //언더 플로우
        //오버플로우와 반대되는 개념
        byte num2 = -128;
        System.out.println("num2 :" + num2);
        num2--;
        System.out.println(num2);

        int firstnum = 1000000000;
        int secondnum = 7000000;
        int multi = firstnum * secondnum;
        System.out.println(multi);//에러는 안나지만 이상한 값 나옴

        long multi2 = (long)firstnum*secondnum;
        System.out.println(multi2);



    }//main
}//class
