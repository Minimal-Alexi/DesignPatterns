import java.util.HashMap;
import java.util.Random;

public class Main {
    private final static int messageNr = 10;
    private final static Random rand = new Random();
    private final static String[] emailAddresses = {"Hater@email.com","NotARussianSpy@email.com","concerned_citizen69@email.com"};
    private final static HashMap<FeedbackEnum,String> messageForType = new HashMap<>();
    public static void main(String[] args) {
        setupMessages();

        Handler compensationHandler = new HandlerCompensation(), developmentHandler = new HandlerDevelopment(), contactHandler = new HandlerContact(), generalHandler = new HandlerGeneral();
        // Let's set all up.
        compensationHandler.setNextHandler(developmentHandler);
        developmentHandler.setNextHandler(contactHandler);
        contactHandler.setNextHandler(generalHandler);

        for(int i = 0; i < messageNr; i++) {
            compensationHandler.process(generateMessage());
        }
        System.out.println("We are removing the general feedback handler to showcase what happens when no one is responsible");
        contactHandler.setNextHandler(null);
        for(int i = 0; i < messageNr; i++) {
            compensationHandler.process(generateMessage());
        }

    }
    private static void setupMessages(){
        messageForType.put(FeedbackEnum.compensationClaim, "I lost my leg. Pay me please");
        messageForType.put(FeedbackEnum.developmentSuggestion, "Please fix your website. This sucks");
        messageForType.put(FeedbackEnum.contactRequest, "We want to contact you about your fighter jets extended warranty");
        messageForType.put(FeedbackEnum.generalFeedback, "Hey uhh, where is the grocery store? Wait this is the wrong website.");
    }
    private static Message generateMessage(){
        Message message = new Message();
        message.setFeedbackType(randomFeedback());
        message.setMessage(messageForType.get(message.getFeedbackType()));
        message.setSenderEmail(emailAddresses[rand.nextInt(emailAddresses.length)]);
        return message;
    }
    private static FeedbackEnum randomFeedback(){
        return FeedbackEnum.values()[rand.nextInt(FeedbackEnum.values().length)];
    }

}
