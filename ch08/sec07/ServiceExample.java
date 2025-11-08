package sec07;

public class ServiceExample {
    public static void main(String[] args) {
        // 인터페이스 변수 선언과 구현 객체 대입
        Service service = new ServiceImpl();

        // default method 호출
        service.defaultMethod1();
        System.out.println();
        service.defaultMethod2();
        System.out.println();

        // static method 호출
        Service.StaticMethod1();
        System.out.println();
        Service.StaticMethod2();
        System.out.println();
    }
}
