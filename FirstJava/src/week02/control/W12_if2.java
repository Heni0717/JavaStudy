package week02.control;

import java.util.Objects;
import java.util.Scanner;

// 중첩 조건문을 활용한 가위바위보

public class W12_if2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("A 입력: ");
        String aHand = sc.nextLine();

        System.out.println("B 입력: ");
        String bHand = sc.nextLine();

        if(Objects.equals(aHand, "가위")){
            if(Objects.equals(bHand, "가위")){
                System.out.println("무승부");
            }else if(Objects.equals(bHand,"바위")){
                System.out.println("B 승리");
            } else if (Objects.equals(bHand,"보")) {
                System.out.println("A 승리");
            }else {
                System.out.println("B가 유효하지 않은 값 입력");
            }
        } else if (Objects.equals(aHand, "바위")) {
            if(Objects.equals(bHand, "가위")){
                System.out.println("A 승리");
            }else if(Objects.equals(bHand,"바위")){
                System.out.println("무승부");
            } else if (Objects.equals(bHand,"보")) {
                System.out.println("B 승리");
            }else {
                System.out.println("B가 유효하지 않은 값 입력");
            }
        } else if (Objects.equals(aHand, "보")) {
            if(Objects.equals(bHand, "가위")){
                System.out.println("B 승리");
            }else if(Objects.equals(bHand,"바위")){
                System.out.println("A 승리");
            } else if (Objects.equals(bHand,"보")) {
                System.out.println("무승부");
            }else {
                System.out.println("B가 유효하지 않은 값 입력");
            }
        }else {
            System.out.println("A가 유효하지 않은 값 입력");
        }

    }
}
