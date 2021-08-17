package strategy;

public abstract class Vehicle {
    TransportMedium transportMedium;
    public Vehicle(){

    }
    public void showTransportMedium(){
        transportMedium.transport();
    }
    
    public void commonJob(){
        System.out.println("All used to transport");
    }
    public abstract void showMe();
}
