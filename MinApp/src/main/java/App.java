import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
    public void start(Stage primaryStage){
        ChatMediatorImpl mediator = new ChatMediatorImpl();
        mediator.registerClient(new ChatClient("Banana lover",mediator));
        mediator.registerClient(new ChatClient("Minerva-A",mediator));
        mediator.registerClient(new ChatClient("Joker",mediator));
        mediator.showAllClients();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
