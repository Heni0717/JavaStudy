package week01;

// 클래스
// public : (접근)제어자(공공의, 공통의) - 외부에서도 실행시킬수 있는?
public class W01 {

    public static void main(String[] args) {
        // [기본형 변수]
        // (1) 논리형 boolean
        final boolean flag = true;
        boolean flag2;
        flag2 = false;

        // (2) 문자형 char
        char test = 'A';

        // (3) 정수형 byte, short, int, long
        byte byteNumber = 127;
        short shortNumber = 32767;
        int intNumber = 2147483647;
        long longNumber = 2147483647L;

        // (4) 실수형 float, double
        float floatNumber = 0.123F;
        double doubleNumber = 0.123123123;

        // [참조형 변수]
        // (1) 문자열
        String stringTest = "나는 문어";

        // (2) 배열
        int[] a = {1,2,3};

        // [래퍼 클래스 변수]
        int num = 25;
        Integer age = num;  //boxing
        System.out.println(age.intValue());    //unboxing
    }
}