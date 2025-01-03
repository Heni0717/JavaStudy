package week02.collection;

import java.util.LinkedList;
import java.util.Queue;

public class Col4 {
    public static void main(String[] args) {
        // Queue : FIFO
        //  add, peak, poll
        //  -> 생성자가 없는 인터페이스????

        Queue<Integer> intQueue = new LinkedList<>();
        intQueue.add(1);
        intQueue.add(2);
        intQueue.add(3);

        while (!intQueue.isEmpty()){
            System.out.println(intQueue.poll());    // 처음 들어간것부터 빼면서 출력
        }

        intQueue.add(1);
        intQueue.add(2);
        intQueue.add(3);
        System.out.println(intQueue.peek());    // 처음 들어간 것부터 조회
        System.out.println(intQueue.size());

    }
}
