public class Main {
    public static void main(String[] args) {
        ChatMediatorImpl mediator = new ChatMediatorImpl();
        mediator.registerClient(new ChatClient("Banana lover",mediator));
        mediator.registerClient(new ChatClient("Minerva-A",mediator));
        mediator.registerClient(new ChatClient("Joker",mediator));
    }
}
