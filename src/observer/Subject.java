package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements SubjectInterface {
    private int flag;
    List<Observer> observers = new ArrayList<>();

    public int getFlag(){
        return flag;
    }
    public void setFlag(int flag) {
        this.flag = flag;
        notifyRegisteredUsers(flag);
    }
    @Override
    public void register(Observer observer) {
        observers.add(observer);
        
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
        
    }

    @Override
    public void notifyRegisteredUsers(int notifiedValue) {
        for(Observer observer:observers){
            observer.update(notifiedValue);
        }
        
    }
    
}
