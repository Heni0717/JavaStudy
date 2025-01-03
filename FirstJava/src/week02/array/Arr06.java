package week02.array;

public class Arr06 {
    public static void main(String[] args) {
        // 배열 조회
        // 최대값 구하기
        int[] arr = {1,2,3,4,5};
        int max = arr[0];   // 최대값 초기화 세팅

        for(int num:arr){
            if(num>max){
                max=num;
            }
        }
        System.out.println(max);
    }
}
