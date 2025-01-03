package week02.collection;

import java.util.Stack;

public class Col3 {
    public static void main(String[] args) {
        // Stack : 수직으로 값을 넣고 빼는 모양의 FIFO 자료구조
        // push, peek, pop
        //  -> 최근 저장된 데이터를 나열하거나, 데이터의 중복 처리를 막을 때

        Stack<Integer> intStack = new Stack<Integer>();

        // (1) 추가
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        // 다 지워질때까지 출력
        while (!intStack.isEmpty()){
            System.out.println(intStack.pop()); //pop() : 제일 마지막 요소가 빠지면서 출력됨
        }

        // (2) 조회
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        System.out.println(intStack.peek());    // 제일 마지막 요소 조회
        System.out.println(intStack.size());    // 길이 ? 조회

    }
}
