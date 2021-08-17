package observer;

/**
 * ObserverExample
 */
public class ObserverExample {
    public static void main(String[] args) {
        System.out.println("***********Observer pattern - Example*********");
        Observer myObserver1 = new ObserverType1("Luis");
        Observer myObserver2 = new ObserverType1("Juan");
        Observer myObserver3 = new ObserverType2("Felipe");

        Subject subject = new Subject();
        subject.register(myObserver1);
        subject.register(myObserver2);
        subject.register(myObserver3);
        System.out.println("Register flag 5");
        subject.setFlag(5);
        // Unregister Luis
        subject.unregister(myObserver1);
        System.out.println("Register flag 50");
        subject.setFlag(50);
        // Register luis again
        subject.register(myObserver1);
        System.out.println("Register flag 100");
        subject.setFlag(100);
                
    }
}