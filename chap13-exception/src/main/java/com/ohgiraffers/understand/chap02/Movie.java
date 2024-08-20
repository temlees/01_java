package main.java.com.ohgiraffers.understand.chap02;

import java.util.ArrayList;
import java.util.Scanner;

public class Movie {

   private String title;
   private String runTime;
   private int seat;
   private int reservationSeat;


   public Movie() {
   }

   public Movie(String title, String runTime, int seat) {
      this.title = title;
      this.runTime = runTime;
      this.seat = seat;
      this.reservationSeat = reservationSeat;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getRunTime() {
      return runTime;
   }

   public void setRunTime(String runTime) {
      this.runTime = runTime;
   }

   public int getSeat() {
      return seat;
   }

   public void setSeat(int seat) {
      this.seat = seat;
   }

   public int getReservationSeat() {
      return reservationSeat;
   }

   public void setReservationSeat(int reservationSeat) {
      this.reservationSeat = reservationSeat;
   }

   public int resAble() {
      return seat - reservationSeat;
   }

   @Override
   public String toString() {
      return "Movie{" +
              "title='" + title + '\'' +
              ", runTime='" + runTime + '\'' +
              ", 남은좌석수=" + (seat -reservationSeat)+

              '}';
   }





}//class


