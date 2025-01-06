package week3.inter;

// Main은 D클래스를 상속받으면서, C인터페이스를 구현함
// C인터페이스는 A,B를 상속받은 인터페이스
// => Main은 ABCD의 모든 메소드를 모두 재정의할 수 있음
public class Main extends D implements C {

    @Override
    public void a() {
        System.out.println("A");
    }

    @Override
    public void b() {
        System.out.println("B");
    }

    // D클래스의 메소드를 오버라이딩함
    @Override
    void d() {
        super.d();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.a();
        main.b();
        main.d();
    }
}

interface A {
    void a();
}

interface B {
    void b();
}

interface C extends A, B {
}

class D {
    void d() {
        System.out.println("D");
    }
}