package singleton;

public class SingletonExample {
    public static void main(String[] args) {
        System.out.println("***** Captain Example*****");
        System.out.println("Accessing to captain:");
        Captain captain = Captain.getCaptain();
        System.out.println("Get other one");
        Captain captain2 = Captain.getCaptain();

        if(captain == captain2){
            System.out.println("The two instances are the same");
        }
    }
}
