package main.java.com.ohgiraffers.understand.chap03;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Product product = new Product();
        OrderItem orderItem = new OrderItem();
        Scanner sc = new Scanner(System.in);
        System.out.println("회원가입");
        System.out.println("이름 :");
        String name = sc.nextLine();
        System.out.println("아이디");
        String id = sc.nextLine();
        //회원가입
        Customer customer = new Customer(name, id);

        //제품목록 리스트로 생성 스캐너와 while문으로 무한루프
        System.out.println("몇개의 제품을 추가 하시겠습니까 ?");
        int choice = sc.nextInt();
        sc.nextLine();
        int i=0;
        ArrayList<Product> productslist = new ArrayList<>();
        while (i < choice) {
            System.out.println("추가할 제품 이름 :");
            String productName = sc.nextLine();
            System.out.println("추가할 제품의 가격 :");
            int productPrice = sc.nextInt();
            System.out.println("재고 수량 :");
            int productQuantity = sc.nextInt();
            //스페이스 지우기
            sc.nextLine();
            productslist.add(new Product(productName, productPrice, productQuantity));
            i++;
        }

        while (true){
            System.out.println("1. 제품 목록 조회 2.제품 주문,3.주문내역 조회 4. 프로그램 종료");
            int choice2 = sc.nextInt();
            switch (choice2) {
                case 1: productList(productslist); break;
                case 2: ;orderItem.order(productslist); break;
                case 3 : orderItem.total(); break;
                case 4 :
                    System.out.println("프로그램종료"); return;

            }

        }



    }//main

    //제품들의 목록을 조회해주는 메소드
    public static void productList(ArrayList<Product> productList) {
        ArrayList<Product> list = productList;
        for (Product p : list) {
            System.out.println(p);
        }
    }
}//class
