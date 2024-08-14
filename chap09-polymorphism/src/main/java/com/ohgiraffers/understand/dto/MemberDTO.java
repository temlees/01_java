package main.java.com.ohgiraffers.understand.dto;

public class MemberDTO {
    private String ID;

    private String  pwd;

    public MemberDTO() {
    }

    public MemberDTO(String ID, String pwd) {
        this.ID = ID;
        this.pwd = pwd;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "ID='" + ID + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
