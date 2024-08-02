package section03.constant;

public class Application01 {
    public static void main(String[] args) {
        /*
        * 상수란 ?
        * 변수가 메모리에 변경될 값을 저장하기 위한 공간을 나타낸다면, 상수는 이와 상반되는 개념
        * 변하지 않는 값(고정된 값)을 저장해두기위한 메모리 상의 공간을 상수라고 한다
        * 
        * 상수의 사용 목적
        * 1.변경되지 않는 고정된 값을 저장할 목적으로 사용
        * 2. 초기화 이후 값 대입시 컴파일 에러를 발생시켜 수정되지 못하도록 함
        * 
        * 상수의 사용 방법
        * 1. 상수 선언
        * 2. 값 초기회
        * 3. 필요한 위치에 호출 후 사용
        * */

        //상수는 선언시에 final 키워드 붙인다 (대문자로)
        final int AGE;

        AGE = 10;
        //AGE = 20; 초기화 이후 상수 값은 변경 불가능

        System.out.println("AGE의 값"+ AGE);
        System.out.println("AGE 두배의 값"+ (AGE*2));

        //변수에 대입 가능
        int sum = AGE;

    }//main
}//class
