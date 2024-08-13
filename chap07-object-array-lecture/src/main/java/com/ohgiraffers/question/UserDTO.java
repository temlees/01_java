package main.java.com.ohgiraffers.question;

public class UserDTO {
    public String id;
    public String name;
    public int pwd;
    public int pwdOK;

    public UserDTO() {
    }

    public UserDTO(String id, String name, int pwd, int pwdOK) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.pwdOK = pwdOK;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPwd() {
        return pwd;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    public int getPwdOK() {
        return pwdOK;
    }

    public void setPwdOK(int pwdOK) {
        this.pwdOK = pwdOK;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pwd=" + pwd +
                ", pwdOK=" + pwdOK +
                '}';
    }
}//class
