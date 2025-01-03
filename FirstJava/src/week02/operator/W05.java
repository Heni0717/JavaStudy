package week02.operator;

public class W05 {
    // 대입연산자
    // 변수를 바로 연산해서 그 자리에서 저장(대입)하는 연산자
    // 기본대입연산자 : =
    public static void main(String[] args) {
        int num = 10;
        num = num+2;
        System.out.println(num);
        num = num-2;
        System.out.println(num);
        num = num*2;
        System.out.println(num);
        num=num/2;
        System.out.println(num);
        num=num%2;
        System.out.println(num);
        System.out.println("-----------------");

        num = 10;
        num+=2;
        System.out.println(num);
        num-=2;
        System.out.println(num);
        num*=2;
        System.out.println(num);
        num/=2;
        System.out.println(num);
        num%=2;
        System.out.println(num);
        System.out.println("-----------------");

        // ++,--
        num++;  //num=num+1 -> num+=1 -> num++
        System.out.println(num);
        num--;
        System.out.println(num);
    }
}
