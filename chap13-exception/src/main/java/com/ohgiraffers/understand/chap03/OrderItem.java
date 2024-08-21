package main.java.com.ohgiraffers.understand.chap03;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderItem {
    private String orderItemName;
    private int orderQuantity;

    private static ArrayList<Product> orderItemslist = new ArrayList<>();
    ;


    public OrderItem() {
    }

    public OrderItem(int orderQuantity, String orderItemName) {
        this.orderQuantity = orderQuantity;
        this.orderItemName = orderItemName;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public String getOrderItemName() {
        return orderItemName;
    }

    public void setOrderItemName(String orderItemName) {
        this.orderItemName = orderItemName;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "orderItemName='" + orderItemName + '\'' +
                ", orderQuantity=" + orderQuantity +
                '}';
    }

    //주문된 제품을 list에 담는 메소드
    public void order(ArrayList<Product> list) {
        int orderPrice = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("주문할 제품이름 :");
        String ordername = sc.nextLine();


        for (Product p : list) {
            if (p.getProductName().equals(ordername)) {
                orderPrice += p.getProductPrice();
                orderItemslist.add(p);
                System.out.println("주문이 추가되었습니다.");
            }
        }
        System.out.println("주문한 제품의 가격은 " + orderPrice + "원 입니다");

    }//


    //주문한 내역을 보여주는 메소드
    public void total() {
        int totalprice = 0;
        String totalName ="";
        if (!orderItemslist.isEmpty()) {
            for (Product p : orderItemslist) {
                System.out.println("주문한 상품의 이름은 :" + p.getProductName());
                totalName += p.getProductName()+" ";
                System.out.println("주문한 상품의 가격은 :" + p.getProductPrice());
                totalprice = totalprice + p.getProductPrice();

            }
            System.out.println("주문하신 상품명 "+totalName +"입니다");
            System.out.println("주문한 상품들의 총 금액은 : " + totalprice + "원 입니다");
        } else {
            System.out.println("주문내역이 없습니다");
        }
    }

    ;
}
