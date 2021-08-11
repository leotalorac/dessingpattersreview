package abstractfactory;

public class WildTiger implements Tiger {

    @Override
    public void speak() {
        System.out.println("I´m a wild Tiger");
        
    }

    @Override
    public void preferredAction() {
        System.out.println("I hunt in the jungle");
    }
    
}
