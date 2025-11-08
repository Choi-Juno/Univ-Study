package sec08;

public class MultiInterfaceImplExample {
    public static void main(String[] args) {
        // RemoteControl 인터페이스 변수 선언 및 구현 객체 대입
        RemoteControl rc = new SmartTelevision();
        rc.turnOn();
        rc.turnOff();

        // Searchable 인터페이스 변수 선언 및 구현 객체 대입
        Searchable searchable = new SmartTelevision();
        searchable.search("https://www.naver.com");

        // SmartTelevision 객체 대입
        SmartTelevision stv = new SmartTelevision();
        stv.turnOn();
        stv.turnOff();
        stv.search("https://www.naver.com");
    }
}
