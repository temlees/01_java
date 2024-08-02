package section05.typecasting;

public class Application02 {
    public static void main(String[] args) {
        /*
        * 강제 형변환
        * 바꾸려는 자료형으로 캐스팅 연산자를 이용하영 변환
        *
        * 자동 형변횐 규칙과 반대 상황에서 강제 형변환이  팔요하다
        * 1. 강제형변환의 규칙
        * 1-1 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환 필요
        * 1-2 실수를 정수로 변경 시 강제 형변환 필요
        * 1-3 문자형을 int 미만의 크기의 변수에 저장할 때 강제 형변환 필요
        * 1-4 논리형은 규칙 제외
        * */

        //큰 자료형에서 작은 자료형으로 변경시 강제 형변환

        //정수간의 강제 형변환
        long lnum = 8l;
        int inum = (int)lnum;//데이터 손실의 위험 떄문에 컴파일러가 에러를 발생시킨다.
        short snum = (short)inum;
        byte bnum = (byte)snum;
        System.out.println(bnum);

        //실수간의 강제 형변환
        double dnum = 8.0;
        float fnum = (float)dnum;

        //실수를 정수로 변경시 강제 형변환 필요.
        float fnum2 = 4.0f;
        long lnum2 = (long) fnum2;// 해당방식으로 형변환을 하게되면 소수점 이하의 값은 내림한다
        System.out.println(lnum2);

        //문자형 int 미만 크기의 변수에 저장할 떄는 강제 형변환이 필요함
        char ch = 'a';
        int inum3 = ch;
        byte bnum3 =(byte) ch;
        short snum3 = (short)inum3;

        //정수를 문자열에 대입 시 강제 형변환이 필요하다.

        //boolean은 제외된다


    }//main
}//class
