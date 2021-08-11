package abstractfactory;

public class WildDog implements Dog {

    @Override
    public void speak() {
        System.out.println("I am a Wild Dog");
        
    }

    @Override
    public void preferredAction() {
        System.out.println("I run in the street");
        
    }
    
}
