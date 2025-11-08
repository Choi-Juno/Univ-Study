package sec02;

public class Audio implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("Audio is turned on.");
    }
}
