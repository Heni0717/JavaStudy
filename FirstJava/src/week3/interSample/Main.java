package week3.interSample;

public class Main {
    public static void main(String[] args) {

        // A 인터페이스에 구현체 B 대입
        A a1 = new B();     //=> B의 타입은 A로 자동형변환
        a1.a();             //=> B가 오버라이딩한 구현메소드 호출
        // a1.b(); // 불가능 => b()는 B클래스가 가진 메소드이기 때문

        System.out.println("\nB 강제 타입변환");
        B b = (B) a1;
        b.a();
        b.b(); // 강제 타입변환으로 사용 가능
        System.out.println();

        // A 인터페이스에 구편체 B를 상속받은 C 대입
        A a2 = new C();
        a2.a();
        //a2.b(); // 불가능
        //a2.c(); // 불가능

        System.out.println("\nC 강제 타입변환");
        C c = (C) a2;
        c.a();
        c.b(); // 강제 타입변환으로 사용 가능
        c.c(); // 강제 타입변환으로 사용 가능


    }
}

interface A {
    void a();
}
class B implements A {
    @Override
    public void a() {
        System.out.println("B.a()");
    }

    public void b() {
        System.out.println("B.b()");
    }
}
class C extends B {
    public void c() {
        System.out.println("C.c()");
    }
}
