package prototype;

import java.util.Random;

public abstract class BasicCar implements Cloneable {
    public String modeName;
    public int basePrice;
    public int onRoadPrice;

    public String getModeName() {
        return modeName;
    }
    public void setModeName(String modeName) {
        this.modeName = modeName;
    }
    public static int setAdditionalPrice(){
        int price = 0;
        Random r = new Random();
        int p = r.nextInt(100000);
        price=p;
        return price;
    }
    public BasicCar clone() throws CloneNotSupportedException{
        return (BasicCar)super.clone();
    }
}
