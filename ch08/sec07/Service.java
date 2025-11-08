package sec07;

public interface Service {
    // default method
    default void defaultMethod1() {
        System.out.println("defaultMethod1 종속 코드");
        defaultCommon();
    }

    default void defaultMethod2() {
        System.out.println("defaultMethod2 종속 코드");
        defaultCommon();
    }

    private void defaultCommon() {
        System.out.println("defaultMethod 중복 코드A");
        System.out.println("defaultMethod 중복 코드B");
    }

    // static method
    static void StaticMethod1() {
        System.out.println("StaticMethod1 종속 코드");
        staticCommon();
    }

    static void StaticMethod2() {
        System.out.println("StaticMethod2 종속 코드");
        staticCommon();
    }

    private static void staticCommon() {
        System.out.println("StaticMethod 중복 코드A");
        System.out.println("StaticMethod 중복 코드B");
    }
}
