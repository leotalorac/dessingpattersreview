package observer;

public class ObserverType1 implements Observer {
    private String nameOfObserver;

    public ObserverType1(String name){
        nameOfObserver=name;
    }
    @Override
    public void update(int updateValue) {
        System.out.println(nameOfObserver + "Has received an alert: Updated"+ 
        "myValue in Subject is " + updateValue);  
    }
}
