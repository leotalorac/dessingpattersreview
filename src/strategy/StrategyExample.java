package strategy;

public class StrategyExample {
    public static void main(String[] args) {
        System.out.println("******Strategy pattern - Example*******");
        Vehicle vehicleContext = new Boat();
        vehicleContext.showMe();
        vehicleContext.showTransportMedium();
        System.out.println("---------------------");
        vehicleContext = new Aeroplane();
        vehicleContext.showMe();
        vehicleContext.showTransportMedium();
    }
}
