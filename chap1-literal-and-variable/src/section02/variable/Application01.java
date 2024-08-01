package section02.variable;

public class Application01 {
    public  static void main(String[] args) {
        /*
        * 변수의 사용 목적에 대하여 이해할 수 있다.
        *
        * 변수의 사용목적
        * 1. 값의 의미를 부여하기 위한 목적(의미 전달이 쉬워야 코드를 읽기 쉬워지고, 협업 및 유지보수에 유리)
        * 2. 한 번 저장해 둔 값을 재사용하기 위한 목적(변수를 이용하여 코드를 작성하면
        * 값을 변경할때 간단)
        * 3. 시간에 따라 변하는 값을 저장하고 사용할 수 있다.(변하는 겂을 저장하기 위한 공간.)
        * */
        System.out.println("첫달 김과장님 보너스를 포함한 급여" +  (100+20)+ "만원");
        System.out.println("둘째달 김과장님의 보너스를 제외한 급여" + 100 + "만원");
        //값을 재사용하기 위한 목적
        int salary = 100;
        int bonus = 20;

        System.out.println("첫달 김과장님 보너스를 포함한 급여" + (salary + bonus)+ "만원");
        // 에러 방지에 좋음

        //시간에 따라 변경되는 값을 저장하고 사용할 수 있다.
        String name = "김부장";
        int point = 100;

        System.out.println(name + "은 쇼핑몰 중독이다. \n 지난달" + name +"의 보너스 포인트는"+ point+"였다");

        point += 100;
        System.out.println("이번달" + name + "의 보너스 포인트는 "+ point+"이다");
        // 코드 수정후 깃허브 업데이트버전
    }
}//class
