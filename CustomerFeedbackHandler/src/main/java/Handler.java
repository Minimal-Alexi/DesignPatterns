public abstract class Handler {
    private final FeedbackEnum feedback;
    private Handler nextHandler;
    public Handler(FeedbackEnum feedback) {
        this.feedback = feedback;
    }
    public abstract void handle(Message message);
    public void process(Message message) {
        if(message.getFeedbackType() == feedback) {
            handle(message);
        }
        else {
            if(nextHandler != null) {
                nextHandler.handle(message);
            }
            else{
                System.out.println("Couldn't handle message of type: " + message.getFeedbackType());
            }
        }
    }
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
    }
