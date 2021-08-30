package chain;

public class IssueRaiser {
    public Receiver setFirstReceiver;
    public void setSetFirstErrorReceiver(Receiver firstErrorHandle){
        this.setFirstReceiver=firstErrorHandle;
    }
    public void raiseMessage(Message message){
        if(setFirstReceiver !=null)
            setFirstReceiver.handleMessage(message);
    }
}
