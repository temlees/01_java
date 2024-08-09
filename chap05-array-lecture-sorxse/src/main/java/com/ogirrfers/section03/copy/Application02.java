package main.java.com.ogirrfers.section03.copy;

public class Application02 {

    public static void main(String[] args) {

        // 얕은 복사를 활용해 매개변수와 리턴값으로 활용해보자.
        String[] names = {"홍길동", "유관순", "이순신"};

        System.out.println(names.hashCode());
        print(names);

        String [] animals = getAnimals();
        print(animals);

    }

    //매개변수 => 문자형 배열
    public static void print(String[] args) {
        System.out.println(args.hashCode());

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i] + " ");
        }
    }//print()

    public static String[] getAnimals() {

        String [] animals = {"호랑이","사자","낙타"};

        System.out.println("animals.hashcode() =" +animals.hashCode());

        return animals;
    }
}//CLASS
