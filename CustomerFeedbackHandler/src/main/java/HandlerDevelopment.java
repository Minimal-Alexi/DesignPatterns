public class HandlerDevelopment extends Handler {
    public HandlerDevelopment() {
        super(FeedbackEnum.developmentSuggestion);
    }
    protected void handle(Message message){
        System.out.println("Hey " + message.getSenderEmail() + " thank you for your suggestion: " + message.getMessage() + greeting);
    }
}
