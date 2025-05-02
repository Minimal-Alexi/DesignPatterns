import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ChatClient {
    private String username;
    private ChatMediator mediator;

    private Stage stage;
    private TextArea chatLog;
    private TextField sendField;
    private ChoiceBox<String> sendChoiceBox;
    private Button sendButton;

    public ChatClient(String username, ChatMediator mediator) {
        this.username = username;
        this.mediator = mediator;
        buildUI();
        mediator.registerClient(this);
    }
    public void receiveMessage(String message) {
        chatLog.appendText(message + "\n");
    }
    public void rebuildChatClientOptions(ArrayList<ChatClient> chatClients){
        sendChoiceBox.getItems().clear();
        for(ChatClient chatClient : chatClients){
            if(!chatClient.getUsername().equals(username)){
                sendChoiceBox.getItems().add(chatClient.getUsername());
            }
        }
    }
    public void show(){
        stage.show();
    }
    private void buildUI(){
        chatLog = new TextArea();
        sendField = new TextField();
        sendButton = new Button("Send");
        sendChoiceBox = new ChoiceBox<>();
        stage = new Stage();

        HBox hbox = new HBox();
        hbox.getChildren().addAll(sendField, sendButton,sendChoiceBox);
        hbox.setSpacing(10);

        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().addAll(chatLog, hbox);

        sendButtonInitialization();

        stage.setScene(new Scene(vbox));
        stage.setTitle("Chat Client " + username);
    }
    private void sendButtonInitialization(){
        sendButton.setOnAction(event -> {
            mediator.sendMessage(username,sendField.getText(),sendChoiceBox.getValue());
        });
    }
    public String getUsername() {
        return username;
    }
}
