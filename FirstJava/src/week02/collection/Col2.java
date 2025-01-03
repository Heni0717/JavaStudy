package week02.collection;

import java.util.LinkedList;

public class Col2 {
    public static void main(String[] args) {
        // linked list : 메모리에 남는 공간을 요청해 나누어 실제 값을 저장,
        // -> 실제 값이 있는 주소값으로 목록을 구성하고 저장하는 자료구조
        // -> 기본 기능은 ArrayList와 동일하지만 나누어 담았기에 조회가 느리고 추가/삭제가 빠름

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.toString());  // 조회속도 느림

        linkedList.add(200);
        System.out.println(linkedList.toString());

        linkedList.add(2,4);
        System.out.println(linkedList.toString());  // 추가속도 빠름

        linkedList.set(1,30);
        System.out.println(linkedList.toString());

        linkedList.remove(1);
        System.out.println(linkedList.toString());

        linkedList.clear();
        System.out.println(linkedList.toString());
    }
}
