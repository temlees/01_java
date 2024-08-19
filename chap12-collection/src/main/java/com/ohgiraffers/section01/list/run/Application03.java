package main.java.com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.List;

public class Application03 {
    public static void main(String[] args) {
        /*
        * LinkedList
        * ArrayList 가 배열을 이용해 발생하는 단점을 보완하고자 만듦
        * 내부는 이중 연결 리스트로 되어있다.
        *
        * 이중 연결 리스트?
        * :단일 연결 리스트는 다음 요소만 링크하는 반면
        * 이중 연결 리스트는 이전 요소도 링크하여 이전 요소로 쉽게 접근하기 위해 고안됨
        *
        *  LinkedList도 List 상속받는다
        * 하지만 내부적으로 요소 저장방법은 다르다
        * 각 컬렉션프레임워크 클래스들의 특징을 확인하고 맞는 클래스를 쓰자
        * */
        //값 추가는 ArrayList 와 동일하다
        List<String> linkedList = new LinkedList<String>();
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("orange");
        linkedList.add("mango");
        linkedList.add("grape");

        System.out.println(linkedList);

        System.out.println(linkedList.size());

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(i+" " +linkedList.get(i));
        }
        linkedList.remove(1);

        for (String s : linkedList) {
            System.out.println(s);
        }
        System.out.println("set");
        linkedList.set(0, "melon");

        for (String s : linkedList) {
            System.out.println(s);
        }

        //리스트 내 요소들을 모두 제거
        linkedList.clear();

        System.out.println(linkedList.isEmpty());
        
        
        /*
        * ArrayList와 LinkedList 차이
        * 
        * ArrayList 장점
        * -내부적으로 배열사용해 인덱스 접근 빠름
        * -메모리 사용량 적음
        * ArrayList의 단점
        * -중간에 값을 추가하거나 삭제하는데 느린성능을 가진다
        * -배열의 크기를 조절할때 새로운 배열을 생성하고 기존요소를 복사(주소값다름)
        * 
        * LinkedList 장점
        * 중간의 값을 추가하거나 삭제할때 빠른 성능
        * -고정된 크기의 배열 필요 x
        * 
        * LinkedList단점
        * -느린 인덱스 접근 속도
        * -더 복잡한 데이터 구조
        * -더 많은 메모리 사용
        * */
        
        
    }//main
}//class
