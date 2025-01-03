package week02.collection;

import java.util.ArrayList;

public class Col1 {
    public static void main(String[] args) {
        // ArrayList : 순서가 있는 데이터 집합 -> Array와 비슷하지만, 최초 길이를 알지 못해도 만들 수 있음
        // -> Array:정적배열, List:(동적배열:크기가 가변적으로 변함)
        // -> 생성 시점에 작은 연속된 공간을 요청해 참조형 변수들을 담아놓음
        // -> 값이 추가될때 저장공간이 부족하면 더 큰 공간을 받아 저장한다.

        ArrayList<Integer> intList = new ArrayList<Integer>();  // 선언 + 생성
        // (1) 추가
        intList.add(1);
        intList.add(2);
        intList.add(3);
        System.out.println(intList.get(1));
        System.out.println("--------");

        // (2) 수정
        intList.set(1, 10);
        System.out.println(intList.get(1));
        System.out.println("--------");

        // (3) 삭제
        System.out.println(intList.get(0));
        intList.remove(0);
        System.out.println(intList.get(0));
        System.out.println("--------");

        // (4) 전체삭제
        System.out.println(intList.toString());
        intList.clear();
        System.out.println(intList.toString());
    }
}
