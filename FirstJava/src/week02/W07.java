package week02;

public class W07 {
    public static void main(String[] args) {
        // 기타 연산자
        // (1) 형변환 연산자
        int intNum = 93 + (int)98.8;
        System.out.println(intNum);

        double doubleNum = (double) 93 + 98.8;
        System.out.println(doubleNum);

        // (2) 삼항연산자 : 비교연산자와 함께 쓰임
        // 조건 ? 참 : 거짓
        int x = 1;
        int y = 9;

        boolean b = (x==y)?true:false;
        System.out.println(b);

        String s = (x!=y)?"yes":"no";
        System.out.println(s);

        int max = (x>y)?x:y;
        System.out.println(max);

        int min = (x<y)?x:y;
        System.out.println(min);

        // (3) instance of
        // 피연산자가 조건에 명시된 클래스의 객체인지 비교
        // 3주차에서 다룰 내용
    }
}
