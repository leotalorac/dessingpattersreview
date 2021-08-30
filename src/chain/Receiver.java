package chain;

public interface Receiver {
    boolean handleMessage(Message message);
    void nextErrorHandle(Receiver receiver);
}
