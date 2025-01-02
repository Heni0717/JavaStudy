package week02;

public class W06 {
    public static void main(String[] args) {
        // 대입연산자 ++,--에서 주의할점
        int a = 10;
        int b = 10;
        int val = ++a + b--;
        System.out.println(val);

        // 변수 앞에 증감이 붙으면 연산을 실행한 값을 사용, 뒤에 붙으면 변수를 사용한 후에 연산
    }
}
