package week03;

// 1. 클래스 선언 : 설계도 생성??
// 2. 객체가 가지는 속성(필드) 정의
// 3. 객체를 생성하는 방식 정의(생성자)
// 4. 객체가 가지는 행위(메소드) 정의

// (1) 클래스 Car
public class Car {
    // (2) 속성(필드)
    //  고유 데이터
    String company;
    String model = "k3";
    String color;
    double price;
    //  상태 데이터
    double speed;
    char gear;
    boolean lights = true;
    //  객체 데이터
    Tire tire = new Tire();
    Door door;
    Handle handle;

    // (3) 생성자 : 처음 객체가 생성될때(instance화), 어떤 로직을 수행하며, 어떤 값이 필수로 들어가는지를 정의
    public Car(){
        // default 생성자, 아무것도 명시되지 않으며, 생략 가능
    }

    // (4) 메소드
    double gasPedal(double kmh, char type){
        changeGear(type);
        speed = kmh;
        return speed;
    }
    double brakePedal(){
        speed = 0;
        return speed;
    }
    char changeGear(char type){
        gear = type;
        return gear;
    }
    boolean onOffLight(){
        lights = !lights;
        return lights;
    }
    void horn(){
        System.out.println("빵빵..");
    }

    // 자동차의 속도 .. 가변길이 메소드
    void carSpeeds(double ... speeds){
        for(double v : speeds){
            System.out.println("v: "+v);
        }
    }
}
