package prototype;

public class PrototypeExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("*****Prototype pattern DEMO*****");
        BasicCar nano = new Nano("Green Nano");
        nano.basePrice=100000;

        BasicCar ford = new Ford("Ford yellow");
        ford.basePrice=500000;

        BasicCar bc1;
        // nano
        bc1 = nano.clone();

        bc1.onRoadPrice = nano.basePrice + BasicCar.setAdditionalPrice();
        System.out.println("Car is: " + bc1.modeName+" and the price is " + bc1.onRoadPrice);

        // Ford
        bc1 = ford.clone();
        bc1.onRoadPrice = ford.basePrice + BasicCar.setAdditionalPrice();
        System.out.println("Car is: " + bc1.modeName+" and the price is " + bc1.onRoadPrice);
    }
}
