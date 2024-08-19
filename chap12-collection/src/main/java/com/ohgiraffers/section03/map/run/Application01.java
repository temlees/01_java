package main.java.com.ohgiraffers.section03.map.run;

import java.util.*;

public class Application01 {
    public static void main(String[] args) {

        /*
        * Map
        * Collection 인터페이스랑 다른 방식
        * 키와 값을 쌍으로 저장하는 방식
        * 인덱스 대신 키를 사용한다
        *
        * 키?
        * 값을 찾기 위한 이름 역할을 하는 객체를 의미한다
        * 1. 요소의 저장순서를 유지하지 않는다.
        * 2. 키는 중복을 허용하지 않지만 키가 다르면 중복값 저장가능
        *
        * HashMap,HashTable,TreeMap등의 대표적인 클래스가 있지만
        * HashMap이 제일 많이 쓰인다..
        * */

        //(key,값)는 인스턴스만 될 수 있다
        //아래 키값들은 오토박싱이 되어서 기본값이 들어간다
        //순서 유지 안된다.
        HashMap hmap = new HashMap();

        hmap.put("one",new Date());
        hmap.put(2,"redApple");
        hmap.put(3.3,123);
        System.out.println(hmap);

        hmap.put(2,"yellow");
        System.out.println(hmap);

        hmap.put(3,"yellow");
        System.out.println(hmap);

        //값을 가져올때 get()
        System.out.println("키 3에대한 값 :" + hmap.get(3));

        //키값 삭제처리 remove()
        hmap.remove(3);
        System.out.println(hmap);
        System.out.println(hmap.size());

        LinkedHashMap<String,String> hmap2 = new LinkedHashMap<>();
        hmap2.put("one","java17");
        hmap2.put("two","mysql");
        hmap2.put("three","jdbc");
        hmap2.put("four","html5");
        hmap2.put("five","css3");

        //keySet() 이용해서 키만 따로 set으로 만들고 , iterator()로
        //키에대한 목록을 만든다.
        Iterator<String> keyIter = hmap2.keySet().iterator();

        while(keyIter.hasNext()){
            String key = keyIter.next();
            String value = hmap2.get(key);
            System.out.println(key+":"+value);
        }

        Collection<String> values = hmap.values();

        Iterator<String> valueIter = values.iterator();
        while (valueIter.hasNext()){
            System.out.println(valueIter.next());
        }

        Object [] valueArr = values.toArray();
        for (int i = 0; i < valueArr.length ; i++) {
            System.out.println(i+":"+valueArr[i]);
        }


        //map의 내부에 존재하는 EntrySet을 이용
        Set<Map.Entry<String,String>> set = hmap.entrySet();

        Iterator<Map.Entry<String,String>> iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
