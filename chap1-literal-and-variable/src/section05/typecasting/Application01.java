package section05.typecasting;

public class Application01 {
    public static void main(String[] args) {
        /*
        * 데이터 형 변환
        * 데이터 형변환이 필요한 이유
        * 자바에서 다른 타입끼리의 연산은 피 연산자들이 모두 같은 타입이 되어야 실행가능
        * 즉, 같은 데이터 타입 끼리만 연산수행 가능
        * */
        
        /*
        * 형 변환의 종류과 규칙
        * 1. 자동 형변환(묵시적 형변환) : 컴파일러가 자동으로 수행해주는 타입 변환
        * 1-1 작은 자료형에서 큰 자료형을 자동 형변환 된다
        * 1-2 정수는 실수로 자동 형 변환된다
        * 1-3 문자형은 int 형으로 자동 형변환 된다
        * 1-4 논리형은 제외된다
        * 2. 강제 형변환(명시적 형변환) : 형변환 cast연산자를 이용해 강제적으로 수행하는 변환
        * 2-1 자동형변환이 적용되지 않는 경우에 필요
        * */

        // 작은 자료형에서 큰 자료형으로 자동 형변환한다.
        //데이터 손실이 발생하지 않기 떄문에 컴파일러가 자동으로 처리해준다.
        // 큰쪽 = 작은쪽

        byte bnum = 1;
        short dnum = bnum;
        int inum = bnum;
        long lnum = inum;

        //연산 시에도 자동으로 큰 쪽으로 형변환 되어 계산된다
        int num1 = 10;
        long num2 = 20L;

        long result = num1 * num2;
        System.out.println(result);
       //int result1  = num1 *num2;

        //정수는 실수로 자동 형변환된다
        //정수를 실수로 변경할 때 소수점 자리가 없어도 실수형태로 표현이 가능하다
        //데이터 손실이 없기 때문에 자동 형변환이 가능하다.


        long eight = 8L;
        float four = eight;
        System.out.println("four :" +  four);


        float result3 = eight *four;
        System.out.println("result : " + result3);

        char ch1 = 'a';
        int chnumber = 97;

        char chvalue = (char)chnumber;
        System.out.println((int)ch1);
        System.out.println(chvalue);
        System.out.println((char) chnumber);

        char ch2= 65;
        System.out.println("ch2 :" + ch2);

        //논리형은 규칙에서 제외 (자동형변환 안됨)
        boolean isTrue = false;
        //byte b= = isTrue;
    }//main
}//class
