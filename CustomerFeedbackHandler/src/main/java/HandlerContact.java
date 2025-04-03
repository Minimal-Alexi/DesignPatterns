public class HandlerContact extends Handler {
    public HandlerContact() {
        super(FeedbackEnum.contactRequest);
    }
    public void handle(Message message){
        System.out.println("Hey " + message.getSenderEmail() + " we will contact you shortly. Contact topic: " + message.getMessage() + greeting);
    }
}
