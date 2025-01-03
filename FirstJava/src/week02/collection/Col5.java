package week02.collection;

import java.util.HashSet;
import java.util.Set;

public class Col5 {
    public static void main(String[] args) {
        // Set : 순서와 중복없음, 집합과 닮음
        //  -> 그냥 쓸수 있으나, HashSet, TreeSet 등으로 응용해서 사용하기도 함
        //  -> 생성자가 없어 바로 생성 불가능
        //  -> 생성자가 존재하는 HashSet으로 구현해볼 수 있음

        Set<Integer> intSet = new HashSet<>();

        intSet.add(1);
        intSet.add(1);
        intSet.add(2);
        for(Integer value:intSet){
            System.out.println(value);
        }

        // contains : 포함하느냐?
        System.out.println(intSet.contains(1));
        System.out.println(intSet.contains(3));
    }
}
