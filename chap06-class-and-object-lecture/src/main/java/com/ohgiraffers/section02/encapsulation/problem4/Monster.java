package main.java.com.ohgiraffers.section02.encapsulation.problem4;

public class Monster {

    /*
     * 접근제어자(접근 제한자)
     * 클래스 혹은 클래스의 멤버에 참조 연산자로 접근할 수 있는 범위를 제한하기 위한 키워드
     * 1.public :모든 패키지 접근 허용
     * 2.protected: 동일 패키지에 접근 허용 단, 상속 관계있는경우 . 다른 패키지도 가능
     * 3.default : 동일 패키지만 접근 허용
     * 4.private : 해당 클래스 내부에서만 접근허용
     *
     * 위의 네가지 접근제어자는 클래스의 멤버(필드,메소드) 모두 사용 가능하다
     * 단, 클래스 선언 시 사용하는 접근제어자는 public default 만 가능하다,
     * */

//클래스 멤버(전역변수,필드)  여기로  바로 접근이 직접 접근
    private String kind;

    private int hp;
// 클래스멤버(메소드)
    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setHp(int hp){
        if(hp > 0){
            this.hp = hp;
        }else{
            this.hp = 0;
        }
    }

    public String getInfo(){
        return "몬스터 종류는" + this.kind+"이고  체력은"+this.hp+"이다";
    }
}
