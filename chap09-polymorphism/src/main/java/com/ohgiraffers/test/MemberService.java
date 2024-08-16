package main.java.com.ohgiraffers.test;

public class MemberService {

    SnsAuth Auth;


    public  MemberService(SnsAuth Auth) {
        this.Auth = Auth;

    }

    public boolean findMember(MemberDTO memberDTO){
        if (Auth.auth(memberDTO)){

            return true;
        }
        else return false;
    };



}
