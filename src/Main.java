public class Main {
    
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOn lightOn = new LightOn(light);

        Garage garage = new Garage();
        GarageDoorOpen garageDoor = new GarageDoorOpen(garage);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageDoor);
        remote.buttonWasPressed();

    }
}