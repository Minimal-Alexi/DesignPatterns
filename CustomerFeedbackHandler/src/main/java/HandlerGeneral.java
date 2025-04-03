public class HandlerGeneral extends Handler{
    public HandlerGeneral() {
        super(FeedbackEnum.generalFeedback);
    }
    public void handle(Message message){
        System.out.println("Hey " + message.getSenderEmail() + " we will contact you shortly about your general request. Contact topic: " + message.getMessage() + greeting);
    }
}
