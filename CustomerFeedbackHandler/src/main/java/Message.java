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
    public void setFeedbackType(FeedbackEnum feedbackType) {
        this.feedbackType = feedbackType;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }
}
