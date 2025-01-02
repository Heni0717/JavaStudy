package week02;

public class W04 {
    // 논리연산자
    // 비교연산자로 받을 수 있는 boolean 값을 연결하는 연산자
    public static void main(String[] args) {
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = false;

        // (1) 피연산자 중 하나라도 참이면 참 => ||
        System.out.println(flag1 || flag2);
        System.out.println(flag1 || flag2 || flag3);
        System.out.println((5>3) || (3>1));
        System.out.println("-----------------");

        // (2) 피연산자 중 모두 참이면 참 => &&
        System.out.println(flag1 && flag2);
        System.out.println(flag1 && flag2 && flag3);
        System.out.println((5>3) && (3>1));

        // (3) 논리 부정 연산자 (! : NOT)
        System.out.println("-----------------");
        System.out.println(!flag1);
        System.out.println(!(5==5));
        System.out.println(!(5==3));

    }
}
