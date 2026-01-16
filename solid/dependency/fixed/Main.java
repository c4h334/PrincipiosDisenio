package dependency.fixed;

public class Main {
    public static void main(String[] args) {

        Car gasolineCar = new Car(new GasolineEngine());
        gasolineCar.carStart();
        
        Car electricCar = new Car(new ElectricEngine());
        electricCar.carStart();


    }
}
