package week3.packageExample.main;


import week3.packageExample.pk1.Car;

public class Main2 {
    public static void main(String[] args) {
        Car car1 = new Car();
        week3.packageExample.pk2.Car car2 = new week3.packageExample.pk2.Car();

        car1.horn();
        car2.horn();
    }
}
