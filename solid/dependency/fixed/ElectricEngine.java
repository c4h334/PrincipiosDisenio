package dependency.fixed;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Motor electrico encendido.");
    }
}
