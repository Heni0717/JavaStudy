// 클래스
// public : (접근)제어자(공공의, 공통의) - 외부에서도 실행시킬수 있는?

public class Main {
    // [JDK]
    // (1) compiler : .java -> .class
    // (2) JRE
    // (3) JDB : 디버깅

    // () : 소괄호, {} : 중괄호, [] : 대괄호
    // main 메소드, Java 앱(프로젝트)는 항상 main 메소드를 먼저 실행시킴(JVM의 규칙)
    // static : 이 프로그램이 시작될때 무조건 실행되는 녀석임을 표현
    // void : 출력값의 데이터 타입 -> 반환값 없음
    // (String[] args) : 메소드 시작 시 넘겨받을 데이터들(변수들) - 매개변수 자리 - input
    public static void main(String[] args) {

        // 객체 : 특징(속성, 변수), 행동(메소드)
        // 하위객체 표현 : .
        // system의 out객체의 행동인 println()메소드를 실행하라는 것

        System.out.println(7);
        System.out.println(3);
        System.out.println(3.14);
        System.out.println("JAVA");
    }
}