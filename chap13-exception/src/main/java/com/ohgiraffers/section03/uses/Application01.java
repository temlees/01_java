package main.java.com.ohgiraffers.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Application01 {
    public static void main(String[] args) {
        // 위에서 배운 예외처리를 가장 많이 쓰는 곳이
        //io (input.output)패키지이다

        //BufferedReader => 파일을 읽을 수 있는 클래스
        BufferedReader in = null;

        try {
            //지정한 파일이 없을 경우 catch
            in = new BufferedReader(new FileReader("test.dat"));
        } catch (FileNotFoundException e) {
            System.out.println("여기서 에러 발생");
            e.printStackTrace();
        }finally {
            System.out.println("finally실행");
        }
    }
}
