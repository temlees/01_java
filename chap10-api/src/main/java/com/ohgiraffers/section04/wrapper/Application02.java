package main.java.com.ohgiraffers.section04.wrapper;

public class Application02 {
    public static void main(String[] args) {
        //pasing = 문자열 값을 기본자료형으로 변경하는 것

        byte b = Byte.parseByte("1");
        short s = Short.parseShort("2");
        int i = Integer.parseInt("4");
        long l = Long.parseLong("8");
        float f = Float.parseFloat("3.14");
        double d = Double.parseDouble("3.14");
        boolean bl = Boolean.parseBoolean("true");
    }
}
