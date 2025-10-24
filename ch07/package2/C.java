package package2;

import package1.A;

public class C {
    public C() {
        A a = new A();

        a.field1 = 1;
        // a.field2 = 1;
        // a.field3 = 1;

        a.method1();
        // a.method2();
        // a.method3();
    }
}
