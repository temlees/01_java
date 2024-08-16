package main.java.com.ohgiraffers.test;

public class KakaoAuth implements SnsAuth {
    @Override
    public boolean auth(MemberDTO memberDTO) {

        String id ="jinwoo";
        String pwd ="1234";

        if (memberDTO.getId().equals(id) && memberDTO.getPwd().equals(pwd)){
            return true;
        }
        return false;
    }
}
