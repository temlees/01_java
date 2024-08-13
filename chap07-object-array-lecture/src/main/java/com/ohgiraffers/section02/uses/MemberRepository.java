package main.java.com.ohgiraffers.section02.uses;

public class MemberRepository {//데이터 베이스 대용, 실제 데이터 수행부

private final static Member[] members = new Member[10];


//전역변수 는  자동으로 기본값 0 으로 초기화
private static int count;

public static boolean store(Member [] newMembers){
    for (int i = 0; i < newMembers.length ; i++) {
        if(count != 10){
            members[count++] = newMembers[i];
        }else {
            System.out.println("정원추가");
            return false;
        }
    }
    return true;
}//store

    public static Member[] findAllMembers(){
    return members;
    }

}//class
