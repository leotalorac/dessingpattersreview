package factory;

public class Dog implements Animal{

    @Override
    public void Speak() {
        System.out.println("Woof Woof");
        
    }

    @Override
    public void Action() {
        System.out.println("The dog walk");
        
    }
    
}
