package chain;

public class ChainofResponsability {
    public static void main(String[] args) {
        System.out.println("****Chain of responsibility patter Demo *****");
        Receiver faxHandler,emailHandler;
        IssueRaiser issueRaiser = new IssueRaiser();
        faxHandler = new FaxErrorHandler();
        emailHandler = new EmailErrorHandler();
//        create the chain
        issueRaiser.setSetFirstErrorReceiver(faxHandler);
        faxHandler.nextErrorHandle(emailHandler);
        emailHandler.nextErrorHandle(null);

        Message m1 = new Message("Fax is foing slow",MessagePriority.NORMAL);
        Message m2 = new Message("Emails are not reaching.",MessagePriority.HIGH);
        Message m3 = new Message("In Email, CC field is disabled always.",MessagePriority.NORMAL);
        Message m4 = new Message("Fax is not reaching destinations.",MessagePriority.HIGH);

        issueRaiser.raiseMessage(m1);
        issueRaiser.raiseMessage(m2);
        issueRaiser.raiseMessage(m3);
        issueRaiser.raiseMessage(m4);

    }
}
