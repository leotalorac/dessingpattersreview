package chain;

public class FaxErrorHandler implements Receiver{
    private Receiver nextReceiver;
    @Override
    public boolean handleMessage(Message message) {
        if(message.text.contains("Fax")){
            System.out.println("FaxErrorHandle processed " + message.priority + " priority issue: " + message.text);
            return true;
        }else{
            if(nextReceiver!=null)
                nextReceiver.handleMessage(message);
        }
        return false;
    }

    @Override
    public void nextErrorHandle(Receiver receiver) {
        this.nextReceiver = receiver;
    }

    public void setNextReceiver(Receiver nextReceiver) {
        this.nextReceiver = nextReceiver;
    }
}
