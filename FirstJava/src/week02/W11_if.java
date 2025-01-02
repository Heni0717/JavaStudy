package week02;

public class W11_if {
    public static void main(String[] args) {
        boolean flag = false;

        if(flag){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        System.out.println("----------");

        if(1 != 1){
            System.out.println("1은 1과 같지 않다");
        } else if (3 < 1) {
            System.out.println("3은 1보다 작다");
        }else {
            System.out.println("위 조건문은 모두 거짓이다");
        }
        System.out.println("----------");


    }
}
