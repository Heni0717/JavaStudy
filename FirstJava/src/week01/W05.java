package week01;

public class W05 {

    public static void main(String[] args) {
        // 형변환 : 변수의 타입을 바꾸는 방법(문자열->숫자, 정수->실수, 실수->정수,...)

        //명시적 형변환
        // (1) 실수->정수
        double doubleNumber = 10.101010;
        float floatNumber = 10.1010f;

        int intNumber;
//        intNumber = (int) doubleNumber;
//        System.out.println("Double Type => " + doubleNumber);
//        System.out.println("Int Type => " + intNumber);

        // (2) 정수 -> 실수
        int intNumber2 = 10;
        double doubleNumber2 = (double) intNumber2;
        float floatNumber2 = (float) intNumber2;
        System.out.println("intNumber => " + intNumber2);
        System.out.println("doubleNumber2 => " + doubleNumber2);
        System.out.println("floatNumber2 => " + floatNumber2);
    }

    // 자동, 강제 형변환

}