public class Singleton {
    private static Singleton singleton = new Singleton();

    // private 접근 권한을 가진 생성자 생성
    private Singleton() {
    }

    static Singleton getInstance() {
        return singleton;
    }
}
