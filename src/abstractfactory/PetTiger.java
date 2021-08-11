package abstractfactory;

public class PetTiger implements Tiger {

    @Override
    public void speak() {
        System.out.println("I am a Pet tiger");
        
    }

    @Override
    public void preferredAction() {
        System.out.println("I sleep in my house");
    }
    
}
