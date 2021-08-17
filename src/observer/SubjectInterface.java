package observer;

/**
 * SubjectInterface
 */
public interface SubjectInterface {

    public void register(Observer observer);
    public void unregister(Observer observer);
    public void notifyRegisteredUsers(int notifiedValue);
}