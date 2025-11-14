package sec02.exam02;

public class A {
    // 인스턴스 멤버 클래스
    class B {
        // 인스턴스 필드
        int field1 = 1;

        // 정적 필드(Java 17부터 적용)
        static int field2 = 2;

        // 생성자
        B() {
            System.out.println("B-생성자 실행");
        }

        // 인스턴스 메서드
        void mathod1() {
            System.out.println("B-mathod1 실행");
        }

        // 정적 메서드
        static void method2() {
            System.out.println("B-method2 실행");
        }
    }

    void useB() {
        B b = new B();
        b.mathod1();
        b.method2();
        System.out.println(b.field1);
        System.out.println(b.field2);
    }
}
