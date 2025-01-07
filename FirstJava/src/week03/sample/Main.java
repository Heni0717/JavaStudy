package week03.sample;

public class Main {
    public static void main(String[] args) {
        Main main = new Main(); // 기본생성자는 명시되지 않아도 사용 가능
        System.out.println(main.getNum());
        System.out.println(main.getNum());  // 같은값을 리턴하는 이유 : 메소드 내에서만 +1이 진행된 후 소멸되기 때문
    }

    public int getNum(){
        // 지역변수 : 해당 메소드 실행될때마다 독립적인 값을 저장하고 관리
        //  => 메소드 내부에서 정의될 때 생성되고 메소드 종료 시 소멸(휘발성)
        int num = 1;
        num+=1;
        return num;
    }
}
