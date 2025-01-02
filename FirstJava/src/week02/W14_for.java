package week02;

public class W14_for {
    public static void main(String[] args) {
        // for문 기본 구조
        for(int i=0;i<4;i++){
            System.out.println(i+"번째 출력");
        }
        System.out.println("------------------");

        // 향상된 for문(배열과 함께 사용)
        int [] nums = {3,6,9,12,15};
        for(int num:nums){
            System.out.print(num+" ");
        }
        System.out.println("\n------------------");
        for(int i=0; i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
