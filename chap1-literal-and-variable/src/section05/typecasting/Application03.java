package section05.typecasting;

public class Application03 {
    public static void main(String[] args) {

        /*
        * 자동 형변환과 강제 형변환을 이영한 다른 자료형끼리의 계산
        * 다른 자료형끼리의 연산은 큰 자료형으로 자동 형변환 후 연산처리 된다.
        * */

        int inum = 10;
        long lnum = 10l;
        System.out.println(inum + lnum);

        long result = inum +lnum;
        int result2 = inum + (int)lnum;
        System.out.println(result2);

        byte bnum = 1;
        short snum = 2 ;
        int result4 = bnum + snum;// int 가 대표 자료형이라 int 로 바뀜
    }//main
}//clss
