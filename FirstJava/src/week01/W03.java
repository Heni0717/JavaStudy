package week01;

// 숫자 -> 문자
import java.util.Scanner;

public class W03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int asciiNumber = sc.nextInt();
        char ch = (char)asciiNumber; // 문자로 형변환을 해주면 숫자에 맞는 문자로 표현됩니다.

        System.out.println(ch);
    }

}