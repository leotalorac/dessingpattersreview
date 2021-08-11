package abstractfactory;

public class PetDog implements Dog {

    @Override
    public void speak() {
        System.out.println("I am a Pet Dog");
        
    }

    @Override
    public void preferredAction() {
        System.out.println("I bark in my house");
        
    }
    
}
