package main.java.com.ohgiraffers.understand.chap02;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieTheater {

    Scanner sc = new Scanner(System.in);

    //여러개의 Movie 객체를 담을 수있는 ArrayList,static으로 모두가 같은 movies 인스턴스를 사용할 수 있다.
    //모든 movie객체들 저장 및 관리가 가능하다.
    public static ArrayList<Movie> movies = new ArrayList<Movie>();

    //영화추가 메소드
    public void addMovie(int no) {
        int result = 0;
        for (int i = 0; i < no; i++) {
            Movie movie = new Movie();
            System.out.println("영화제목 ");
            String title = sc.nextLine();
            System.out.println("상영시간 ");
            String runtime = sc.nextLine();
            System.out.println("추가할 영화의 총 좌석수");
            int seats = sc.nextInt();
            sc.nextLine();
            //Movie(title, runtime, seats)는 Movie 클래스의 생성자를 호출하여 새로운 Movie 객체를 생성합니다.
            // 생성된 Movie 객체를 movies 리스트에 추가합니다.
            movies.add(new Movie(title, runtime, seats));
            result++;
        }

    }

    //영화 목록 조회 메소드
    public void listView() {
        for (Movie movie : movies) {
            System.out.println(movie);
        }


    }

    //특정영화 예매 메소드
    public void specificMovie() {
        System.out.println("어떤 영화를 예매하시겠습니까 ?");
        Movie newMovie = new Movie();
        sc.nextLine();
        String title = sc.nextLine();
        for (Movie movie : movies) {
            if (movie.getTitle().equals(title)) {
                    movie.setSeat(movie.getSeat() - 1);
                    movie.setReservationSeat(movie.getReservationSeat() + 1);
                    System.out.println("남은 좌석은 " + movie.getSeat());

            }
        }
        System.out.println("예매가 완료되었습니다");

    }
}
