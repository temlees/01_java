package main.java.com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application01 {
    public static void main(String[] args) {
        /*
        *
        * 컬랙션 프레임워크
        * 자바에서 컬랙션 프레임워크는 여러개의 다양한
        * 데이터들을 쉽고 효과적으로 처리할 수 있도록
        * 표준화된 방법을 제공하는 클래스 집합의미
        *
        * 즉 데이터를 효율적으로 저장하는 자료구조와 데이터를
        * 처리하는 알고리즘을 미리 구현해놓은 클래스를 말한다.
        * */

        /*
        *collection 은 크게 3가지인터페이스중 하나를 상속받아 구현
        *
        * 1. List 인터페이스
        * 2. Set 인터페이스
        * 3. Map 인터페이스
        *
        * List 인터페이스와 Set 인터페이스 공통부분을
        * collection 인터페이스에서 정의 한다
        * 하지만 Map은 구조상 차이로 정의 x
        *
        * 1.List 인터페이스
        * -순서있는 데이터의 집합으로 데이터의 중복 저장 허용
        * Vector,ArrayList,LinkedList,Stact, Queue 등이 있다.
        *
        * 2. Set 인터페이스
        * 순서가 없는 데이터집합으로 중복허용 안된다
        * HashSet, TreeSet등이 있다
        *
        *  3.Map 인터페이스
        * 키와 값 한쌍으로 이루어지는 데이터 집합
        * kEY를 Set 방식으로 관리하기 때문에 데이터 순서를 관리 x
        * 중복된 key를 허용 x
        * HashMap,Treemap,HashTable,Properties 등이 있다.
        * */

        /*
        *   ArrayList
        *   -가장 많이 사용되는 컬렉션 클래스이다.
        *   -내부적으로 배열을 이용하여 요소를 관리하며,
        *   인덱스를 이용해 배열요소에 빠르게 접근한다
        *
        *   ArrayList는 배열의 단점을 보완하기위해 만들어 졌다.
        *   배열은 크기를 변경할 수 없고,요소 추가 삭제 정렬이 복잡하다는 단점
        * ArrayList는 이런단점을 보완하고자
        * 크기변경,요소추가,삭제,정렬기능을 미리 메소드로 구현
        * 자동수행이지 속도는 상관없다
        * */

        //크기 지정 없이 자동으로 10칸짜리 배열이 만들어진다.
        //10칸이 넘어가면 새롭게 큰 배열이 만들어진다 (주소값이 달라짐)
        ArrayList a = new ArrayList();

        //보통 범용성을 위해 list로 생성한다
        List list = new ArrayList();

        //컬렉션타입으로 생성하게 되면 set list 둘다 가능
        Collection clist = new ArrayList();


        //넣은 순서대로 인덱스 부여
        //add로 값을 저장.
        list.add("apple");
        list.add(123);
        list.add(45.67);
        list.add(new Date());

        //toString() 되어있다
        System.out.println(list);

        System.out.println("list = : "+ list.size());

        //list에 담긴 값은
        // get으로 가져온다
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(i+" "+list.get(i));

        }

        list.add("apple");
        System.out.println(list);

        //원하는 인덱스 위치에 값을 추가할 수 있다.
        // 값이 바뀌는게 아닌 그자리에 들어가고 인덱스 번호가 하나씩 밀린다.
        list.add(1,"banana");
        System.out.println("list = " + list);
        
        //remove() 저장된 값 삭제
        list.remove(2);
        System.out.println("list = " + list);
        
        //set() : 지정된 위치의 값 수정
        list.set(1,"melon");
        System.out.println("list = " + list);
        
        //모든 컬렉션 프레임워크는 제네릭 클래스로 되어있다.
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("orange");
        //제네릭타입이 문자열이라 못들어간다
       // stringList.add(123);
        System.out.println("stringList = " + stringList);

        /*
        Collections
        * collection 에서 사용되는 기능들
        static 메소드로 구현해 놓은 클래스
        스태틱은 객체생성 안하고 바로 사용가능
        * */
        Collections.sort(stringList);
        System.out.println("stringList = " + stringList);
        
        

    }
}
