package main.java.com.ohgiraffers.understand;

import java.util.*;

public class Quest {

    public static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("몇장 사시나요?");
        int no = sc.nextInt();


        LinkedHashMap<String,Set<Integer>>  lottoResult = new LinkedHashMap<>();
while (count<10){
    System.out.println("몇장 사시나요?");
    no = sc.nextInt();

    if (no>=10){
        System.out.println("10장이상 구입 불가");
        return;
    }
    for (int i = 0; i <no ; i++) {
        Set<Integer> lotto = new HashSet<>();
        while(lotto.size()<6){
            lotto.add((int)(Math.random()*45)+1);
        }
        lottoResult.put((i+1)+"번 로또",lotto);
        count++;
    }
    for (String key : lottoResult.keySet()) {
        System.out.println(key + ": " + lottoResult.get(key));
    }


}


    }//main
}//class
