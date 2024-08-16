package main.java.com.ohgiraffers.section05;

import java.util.Date;

public class Application01 {

    public static void main(String[] args) {

        /*
        * Date 클래스
        * jsk 1.0 부터 날짜를 취급하기 위해 사용되던 클래스
        * 생성자를 비롯하며 대부분 메소드가 Deprecated 되어있다
        *
        * Deprecated?
        * 향후 업데이트 버전에 사리지게될 기능
        *
        *
        *1.Calendar 인스턴스는 불변객체가 아님으로 값 수정가능 --유지보수 악영향
        *
        * 2.윤초를 고려 x
        *
        * 3. Calendar 클래슨느 월을0부터 11까지 표현하는 불편함이 있다
        *
        * */

        Date today = new Date();

        System.out.println(today);
        System.out.println(today.getTime());

        Date time = new Date(1723786157690L);
        System.out.println(time);

    }
}
