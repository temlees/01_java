package main.java.com.ohgiraffers.question;

public class StudentVO {
    int grade;
    int clasroom;
    String name;
    double height;
    char gender;

    public StudentVO() {
    }

    public StudentVO(int grade, int clasroom, String name, double height, char gender) {
        this.grade = grade;
        this.clasroom = clasroom;
        this.name = name;
        this.height = height;
        this.gender = gender;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getClasroom() {
        return clasroom;
    }

    public void setClasroom(int clasroom) {
        this.clasroom = clasroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public char getGenfer() {
        return gender;
    }

    public void setGenfer(char gender) {
        this.gender = gender;
    }


    public void printInformation(int grade, int clasroom, String name, double height, char gender){
        this.grade = grade;
        this.clasroom = clasroom;
        this.name = name;
        this.height = height;
        this.gender = gender;

        System.out.println("학년" + this.grade +
                ", 반" + this.clasroom +
                ", 이름 : " + this.name +
                ", 키 :" + this.height +
                ", 성별 :" + this.gender );
    }

  
}
