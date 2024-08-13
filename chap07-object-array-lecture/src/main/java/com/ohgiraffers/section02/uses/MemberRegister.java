package main.java.com.ohgiraffers.section02.uses;

public class MemberRegister { // 회원 등록을 래퍼지토리에 명령하는 클래스

    public void regist(Member [] members){
        System.out.println("회원을 등록합니다.");

        //
        for(Member member : members){
            System.out.println(member+"님 회원 등록 시도 합니다.");
        }
        //db에 정원이 들어가는지 ?
        if (MemberRepository.store(members)){
            System.out.println("총" + members.length+"명의 회원이 등록 성공!");
        }else{
            System.out.println("인원마감으로 등록 실패");
        }

    }
}
