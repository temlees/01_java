package section05.typecasting;

public class Question {
    public static void main(String[] args) {
        /*
         * 5명의 반 학생이 있으며 키는 각각
         * 178.5/ 170.3/190.7/188.67/160.8이다
         * 우리는 학생의 평균 키를 구해서 화면에 보여준다
         * 소수점은 절삭한다
         * */

        double a = 178.5;
        double b = 170.3;
        double c = 198.7;
        double d = 188.67;
        double e = 160.8;

        int avg = (int) ((a + b + c + d + e) / 5);
        System.out.println("학생의 평균키는 ? " + avg);

        System.out.println("-----------");
        /*
         * 사업을 시작한 홍길동은 이번 달 매출에서 부가세(10%)를 제외한 소득을 알고싶다
         *
         * 매출
         *  150400원
         * 1400원
         * 25000원
         * 30000원
         *
         * 출력 홍길동의 총 매출은 ~원입니다
         * 부가세 제외 소득은 ~이고 부가세는 ~원 입니다
         * */
        int a1 = 150400;

        int b1 = 1400;

        int c1 = 25000;

        int d1 = 30000;

        int all = (a1 + b1 + c1 + d1);
        int allbuga = all / 10;

        System.out.println("홍길동의 총 매출은" + all + "원 입니다");
        System.out.println("부가세 제외 소득은 " + (all - allbuga) + "이고 부가세는" + allbuga + "원 입니다");


    }//main
}
