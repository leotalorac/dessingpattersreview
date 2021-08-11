package builder;

public class BuilderExample {
    public static void main(String[] args) {
        System.out.println("******Builder example DEMO*******");
        Director director = new Director();
        Builder renaultCar = new Car("Renault");
        Builder bmwMotorcyle = new MotorCycle("BMW");
        // Make the car
        System.out.println("***********CAR**********");
        director.construct(renaultCar);
        Product p1 = renaultCar.getVehicle();
        p1.showProduct();
        // Make the motorCycle
        System.out.println("***********MOTORCYCLE**********");
        director.construct(bmwMotorcyle);
        Product p2 = bmwMotorcyle.getVehicle();
        p2.showProduct();
    }
}
