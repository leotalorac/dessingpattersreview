package prototype;

public class Nano extends BasicCar {
    public int basePrice = 1000000;
    public Nano(String m){
        modeName=m;
    }
    @Override
    public BasicCar clone() throws CloneNotSupportedException{
        return (Nano)super.clone();
    }
}
