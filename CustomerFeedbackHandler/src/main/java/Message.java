public class Message {
    private FeedbackEnum feedbackType;
    private String message,senderEmail;
    public String getMessage() {
        return message;
    }
    public String getSenderEmail() {
        return senderEmail;
    }
    public FeedbackEnum getFeedbackType() {
        return feedbackType;
    }
}
