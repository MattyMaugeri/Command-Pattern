public class GarageDoorOpen implements Command {
    Garage garage;

    public GarageDoorOpen(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.open();
    }
    
}