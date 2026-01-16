package dependency.fixed;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void carStart() {
        engine.start();
        System.out.println("El carro ha arrancado.");
    }
}
