package main.java.com.ohgiraffers.section03.dto;

public class MemberDTO {


    private int number;//회원 번호

    private String name;//회원 이름

    private int age;//회원 나이

    private char gender; //회원 성별
    private double weight;//회원 몸무게
    private boolean isActived;//활동상태


    /*
    *  alt + insert
    *
    * 설정자(setter),접근자(getter)의 경우 실무에서 암묵적으로 통용되는 규칙이 존재한다
    * 설정자(setter)작성규칙
    * - 필드값을 변경할 목적의 매개변수를 변경하려는 필드와 같은 자료형으로 선언하고
    *  호출당시 전달되는 매개변수의 값을 이용하여 필드의 값을 변경한다
    * 필드에 매개변수를 저장하는게 setter 필드의 값을 반환하는 것이 getter
    *
    * 접근자(getter)작성 규칙
    * -필드의 값을 반환 받을 목적의 메소드 집합을 의미
    * 각 접근자는 하나의 필드에만 접근
    * 필드에 접근해서 기록된 값을 return하여 반환
    * 이때 반환타입은 반환하려는 값의 자료형과 일치시킨다.
    * */
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isActived() {
        return isActived;
    }

    public void setActived(boolean actived) {
        isActived = actived;
    }
}
