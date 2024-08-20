package main.java.com.ohgiraffers.understand.chap01;


public class BankDB {
UserDTO  userDTO = new UserDTO();

    public void store(int number){
        userDTO.setAccountNumber("123-456");
        userDTO.setName("이진우");

        userDTO.setBalance( userDTO.getBalance() + number);
        if(number >0 ){
            System.out.println("입금 완료");
        }else System.out.println("출금완료");

    }


    public void findView(){
        System.out.println("남은 잔액은 ?" + userDTO.getBalance()+ "원 입니다");
    }

}//DB
