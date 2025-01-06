package week3.extendsExample;

// 자식클래스
public class SportsCar extends Car{
    String engine;
    public void booster() {
        System.out.println("엔진 " + engine + " 부앙~\n");
    }
}