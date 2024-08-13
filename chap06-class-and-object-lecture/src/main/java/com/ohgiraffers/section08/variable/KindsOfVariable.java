package main.java.com.ohgiraffers.section08.variable;

public class KindsOfVariable {
    
    //전역 변수 - 필드
    //생성자로 인스턴스가 만들어 저야 사용가능
    private int globalNum;
    
    //클래스변수(정적필드)
    //인스턴스 생성없이 사용 가능.
    private static int staticNum;
    
    public void testMethod(int num){
                            //매개변수도 일종의 지역변수
        //메소드 안에서 작성한 변수 = 지역변수
        int localNum;

        //매개변수는 호출 시 값이 넘어와서 변경되기 때문에 초기화가 필요없다.
        System.out.println(num);

        //전역변수,클래스변수(정적필드) 도 사용 가능
        System.out.println(globalNum);
        System.out.println(staticNum);
    }//testMethod

    public void testMethod2(){
        System.out.println(globalNum);
        System.out.println(staticNum);
        //num 은 지역변수 이므로 외부에서 사용 불가능
    //    System.out.println(num);
    }//testMethod2

}//class
