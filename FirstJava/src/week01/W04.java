package week01;

// 문자 -> 숫자

import java.util.Scanner;

public class W04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char letter = sc.nextLine().charAt(0); // 첫번째 글자만 받아오기위해 charAt(0) 메서드를 사용합니다.
        int asciiNumber = (int)letter; // 숫자로 형변환을 해주면 저장되어있던 아스키 숫자값으로 표현됩니다.

        System.out.println(asciiNumber);
    }

}