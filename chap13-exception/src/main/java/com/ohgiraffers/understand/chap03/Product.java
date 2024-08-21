package main.java.com.ohgiraffers.understand.chap03;

import java.util.ArrayList;

public class Product {
    private String productName;
    private int productPrice;
    private int productQuantity;

    public Product() {
    }

    public Product(String productName, int productPrice, int productQuantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    @Override
    public String toString() {
        return 
                "제품이름 ='" + productName + '\'' +
                ", 제품 가격=" + productPrice +
                ", 재고 수량=" + productQuantity +
                '}';
    }




}//class
