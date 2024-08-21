package main.java.com.ohgiraffers.understand.chap03;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private String customerID;
    private ArrayList<OrderItem> list;

    public Customer() {
    }

    public Customer(String customerName, String customerID) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.list = list;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public ArrayList<OrderItem> getList() {
        return list;
    }

    public void setList(ArrayList<OrderItem> list) {
        this.list = list;
    }



    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", customerID='" + customerID + '\'' +
                ", list=" + list +
                '}';
    }
}//class
