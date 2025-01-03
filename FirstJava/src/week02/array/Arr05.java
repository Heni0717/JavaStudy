package week02.array;

public class Arr05 {
    public static void main(String[] args) {
        // 다차원 배열

        int[][] arr = new int[2][3];
        for(int i = 0; i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.println("출력값 => "+i+", "+j);
                arr[i][j]=0;
            }
        }

        // 가변 배열 : 열의 길이를 생략하고 행마다 다른 길이의 배열을 요소로 저장
        int [][] arr2 = new int[3][];
        arr2[0]=new int[2];
        arr2[1]=new int[4];
        arr2[2]=new int[1];
        // 중괄호로 초기화할 때도 가능
        int [][] arr3 = {
                {1,2},
                {1,2,3,},
                {1}
        };
    }
}
