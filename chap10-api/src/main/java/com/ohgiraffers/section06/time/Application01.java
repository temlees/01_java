package main.java.com.ohgiraffers.section06.time;

import java.time.*;

public class Application01 {
    public static void main(String[] args) {
        /*
        * time 패키지는
        * Data Calendar 가 가지고있는 단점 해결을 위해 탄생
        * time 패키지의 하위 패키지
        *
        * java.time
        * .chrono : 국제 표준 정의된 달력 시스템을 위한 클래스 제공
        * .format : 날짜와 시간 파싱과 형식에 대한 클래스 제공
        * .temporal: 날짜와 시간 필드와 단위 관련 클래스 제공
        * .zone : 시간대에 관련된 기능 제공
        *
        * 주로 잘 쓰는 클래스는
        * LocalTime, LocalDate LocalDateTime,ZoneDateTime;
        *
        * */

        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);
        LocalTime timeOf =  LocalTime.of(18, 30, 10);

        LocalDate dateNow = LocalDate.now();
        System.out.println(dateNow);
        LocalDate dateOf =  LocalDate.of(2023, 1, 19);
        System.out.println(dateOf);

        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println(dateTimeNow);

        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        System.out.println(zonedDateTimeNow);

         //   ZonedDateTime   zonedDateTimeof =  ZonedDateTime.of(dateOf, ZoneId.of("Asia/seoul"))
    }

}
