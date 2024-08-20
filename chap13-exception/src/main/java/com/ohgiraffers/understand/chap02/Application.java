package main.java.com.ohgiraffers.understand.chap02;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieTheater movieTheater = new MovieTheater();
        Movie movie = new Movie();
        System.out.println("몇 편의 영화를 추가 ?");
        int no = sc.nextInt();
        movieTheater.addMovie(no);

        System.out.println("현재 상영중인 영화 목록 ");
        movieTheater.listView();

        int choice = sc.nextInt();
       loop: while(true){
            System.out.println("1. 특정 영화 예매, 2.상영중인 영화 목록조회 3.프로그램종료");
            switch(choice){
                case 1 :  movieTheater.specificMovie(); break;
                case 2:   movieTheater.listView(); break;
                case 3:  break loop;
                default:
                    System.out.println("잘못된 번호 입력");
            }

        }







    }//main
}//class
