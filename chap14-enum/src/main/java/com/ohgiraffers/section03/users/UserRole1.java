package main.java.com.ohgiraffers.section03.users;

public enum UserRole1 {
    GUEST,
    CONSUMER,
    PRODUCER,
    ADMIN;

    //EnuM은 각각의 인스턴스이다.

    UserRole1(){
        System.out.println("기본생성자 호출");
    }
    //런타임 시기가 아닌 컴파일 시에 모든값이 결정되어있어야한다

    //필요한 경우 메소드도 만들 수 있다.
    public String getNametoLowerCase(){
        return name().toLowerCase();
    }
}
