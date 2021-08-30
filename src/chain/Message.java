package chain;

public class Message {
    public String text;
    public MessagePriority priority;
    public Message(String text,MessagePriority messagePriority){
        this.text = text;
        this.priority=messagePriority;
    }
}
