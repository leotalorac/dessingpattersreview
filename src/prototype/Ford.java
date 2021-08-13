package prototype;

public class Ford extends BasicCar{
    public int basePrice = 1000000;
    public Ford(String m){
        modeName=m;
    }
    @Override
    public BasicCar clone() throws CloneNotSupportedException{
        return (Ford)super.clone();
    }
}
