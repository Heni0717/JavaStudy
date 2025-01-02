package week02;

public class W15_while {
    public static void main(String[] args) {
        //while
        int num = 0;
        while (num < 3){    //(~)인 동안
            num++;
            System.out.println(num+"출력");
        }

        //do~while
        int num2=4;
        do{
            System.out.println(num2+"출력");
        }while (num2<3);
    }
}
