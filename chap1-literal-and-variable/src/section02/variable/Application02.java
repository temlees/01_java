package section02.variable;

public class Application02 {
    public static void main(String[] args) {
        /*
         *  변수를 선언하고 값을 할당하여 사용할 수 있다.
         *
         * 변수를 사용하는 방법
         * 1.변수를 준비한다        -선언
         * 2.변수에 값을 대입한다    -초기화
         * 3.변수를 사용한다
         *
         *  변수에는 자료형이 존재한다
         * 자료형이란 ? 다양한 값의 형태별로 어느정도의 크기를 하나의 값으로
         * 취급할 것인지 미리 컴파일러와 약속을 한 키워드이다.
         * 예) 앞에서 사용한 int 자료형은 4byte 만큼을 읽어서
         * 하나의값으로 취급하겠다는 약속
         * 이러한 자료형은 기본자료형,참조자료형으로 나누어진다
         * 그 중 기본자료형 8가지
         * 프리미티브 타입
         * */

        System.out.println("----------------");
        //목차 1-1 숫자를 ㅊ퓌급하는 자료형
        //1byte는 8개의 bit가 모여진 데이터 단위이다
        //자바는 기본적으로 데이터의 최소단위를 1byte만큼 취급한다.

        //정수형
        byte bnum;//1byte
        short snum;//2byte
        int inum;// 4byte
        long lnum;// 8byte

        //실수형
        float fnum; //4
        double dnum; //8

        //1-2 문자를 취급하는 자료형

        char ch;//2byte;
        System.out.println((char) 97);

        //목차 1-3 논리값을 취급하는 자료형
        boolean isTrue;//1byte

        String str;// 기본자료형에  포함되지 않는 참조 자료형이다 -레퍼런스 타입.


        System.out.println("----변수 초기화----");

        /*
         * 목차 2 변수의 값을 대입하기
         * 위에서 한 변수 선언은 메모리에 값을 저장하기 위해
         * 공간만 생성해둠
         *  그 공간에 대입 연산자를 이용해 자료형에 저장하기로 한 형태의 값을 저장할 수 있다.
         * 만약 약속내용과 다른 형태의 값을 대입하려고 하면 에러  java blink
         *
         * int num = 1;
         *
         * */

        //정수를 취급하는 자료형
        bnum = 1;
        snum = 2;
        inum = 4;
        lnum = 8L;// long 타입으로 명시적 표기
        System.out.println(lnum);

        //실수를 취급하는 자료형에 값 대입
        fnum = 4.0f; // 끝에 f 를 꼭 붙여서 사용가능
        dnum = 4.0;

        System.out.println(fnum);
        System.out.println(dnum);

        //문자를 취급하는 자료형에 값 대입
        ch = 'a';
        char ch2 = 97; // 대응되는 것이 있으면 가능(아스키 코드)
        System.out.println(ch2);

        //논리형을 취급하는 자료형의 값 대입

        isTrue = true;
        System.out.println(isTrue);
        isTrue = false;
        System.out.println(isTrue);

        //문자열을 취급하는 자료형에 값 대입
        str = "안녕하세요";
        System.out.println(str);

        /*
         * 숫자로 된 형태의 값을 그대로 사용하는 자료형은
         * byte,short,iny double,이다
         * 일반적으로 사용하는 값을 독특한 형태가 아닌 일반적인 형태로 사용할 수 있는 자료형을 대표 자료형이라 한다
         * 정수는 int,실수는 double
         * */
        System.out.println("bnum의 값 :" + bnum);
        System.out.println("snum의 값 :" + snum);
        System.out.println("inum의 값 :" + inum);
        System.out.println("lnum의 값 :" + lnum);

        System.out.println("fnum의 값 :" + fnum);
        System.out.println("dnum의 값 :" + dnum);

        System.out.println("isTrue의 값 :" + isTrue);

        System.out.println("str의 값 :" + str);

        //변수를 이용해서 연산하기
        int point = 100;
        int plus = 10;

        //변수에 저장된 값을 이용해 연산가능
        System.out.println("포인트와 보너스의 합은 :" + (point + plus));
        point += 100;
        System.out.println("포인트와 보너스의 합은 :" + (point + plus));


    }//main
}//class
