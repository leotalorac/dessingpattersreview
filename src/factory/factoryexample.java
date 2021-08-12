package factory;
/**
 * factoryexample
 */
public class factoryexample {

    public static void main(String[] args) {
        System.out.println("***** DEMO  FACTORY*****");
        // create a Tiger factory
        AnimalFactory tigerFactory = new TigerFactory();
        Animal atiger = tigerFactory.createAnimal();
        atiger.Speak();
        atiger.Action();
        // Create a Dog factory
        AnimalFactory dogFactory = new DogFactory();
        Animal adog = dogFactory.createAnimal();
        adog.Speak();
        adog.Action();
    }
}