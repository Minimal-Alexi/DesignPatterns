import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
    public void start(Stage primaryStage){
        ChatMediatorImpl mediator = new ChatMediatorImpl();
        ChatClient chatClient1 = new ChatClient("Banana lover",mediator), chatClient2 = new ChatClient("Minerva-A",mediator),
                chatClient3 = new ChatClient("Joker",mediator);
        chatClient1.show();
        chatClient2.show();
        chatClient3.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
