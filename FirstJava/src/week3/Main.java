package week3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println("gear: "+car.gear);
        double speed = car.gasPedal(100,'D');
        System.out.println("speed: "+speed);
        boolean lights = car.onOffLight();
        System.out.println("lights: "+lights);
        System.out.println("gear: "+car.gear);
        System.out.println();

        car.carSpeeds(100,80);
        System.out.println();
        car.carSpeeds(100, 120, 140);
    }
}
