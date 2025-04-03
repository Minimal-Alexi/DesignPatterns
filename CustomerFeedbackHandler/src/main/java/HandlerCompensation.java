public class HandlerCompensation extends Handler{
    public HandlerCompensation() {
        super(FeedbackEnum.compensationClaim);
    }

    public void handle(Message message) {
        System.out.println("Hey " + message.getSenderEmail() + " please receive the 5 euro compensation for the: " + message.getMessage() + greeting);
    }
}
