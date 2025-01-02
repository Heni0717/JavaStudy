package week02;

import java.util.Scanner;

public class W16_gugu {
    public static void main(String[] args) {
        // 구구단
        Scanner sc = new Scanner(System.in);
        int passNum = sc.nextInt();

        // (1) 입력받은 단을 제외하고 출력
        /* for(int i=2;i<=9;i++){
            if(i==passNum){
                continue;
            }
            for(int j=2;j<=9;j++){
                System.out.println(i+" * "+j+" = "+(i*j));
            }
        } */

        // (2) 입력받은 단만 출력
        for(int i=2;i<=9;i++){
            if(i!=passNum){
                continue;
            }
            for(int j=2;j<=9;j++){
                System.out.println(i+" * "+j+" = "+(i*j));
            }
        }
    }
}
