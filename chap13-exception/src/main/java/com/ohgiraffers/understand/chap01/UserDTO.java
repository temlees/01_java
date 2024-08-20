package main.java.com.ohgiraffers.understand.chap01;

public class UserDTO {
    private String accountNumber;
    private String name;
    private int balance;

    public UserDTO() {
    }

    public UserDTO(String accountNumber, int balance, String name) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "accountNumber='" + accountNumber + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
