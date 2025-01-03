package week02.array;

public class Arr01 {
    public static void main(String[] args) {
        // 배열 생성
        int[] intArr = new int[3];  //{0,0,0,}
        boolean[] boolArr = new boolean[3]; //{f,f,f}
        String[] stringArr = new String[3]; //{"","",""}

        // 배열 선언 먼저 -> 후에 초기화
        int[] intArr2;
        intArr2 = new int[3];

        // 생성한 배열 '순회' -> 배열의 값을 하나씩 조회
        // (1) 단건 조회 - index값으로 추출
        System.out.println(intArr[1]);
        System.out.println("-------------");
        // (2) 다건 조회(important!)
        for(int i =0; i<intArr2.length;i++){
            System.out.println(intArr2[i]);
        }


    }
}
