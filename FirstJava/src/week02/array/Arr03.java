package week02.array;

import java.util.Arrays;

public class Arr03 {
    public static void main(String[] args) {
        // 얕은 복사
        int[] a = {1,2,3,4};
        int[] b = a;
        b[0] = 3;   // b배열의 0번째 값을 수정할때
        System.out.println(a[0]);   // 주소값이 복사되기에 a[0]의 값도 함께 수정됨
        System.out.println("--------");

        // 깊은 복사
        int[] c = {1,2,3,4};
        int[] d = Arrays.copyOf(c, c.length);
        c[3] = 0;
        System.out.println(c[3]);
        System.out.println(d[3]);
    }
}
