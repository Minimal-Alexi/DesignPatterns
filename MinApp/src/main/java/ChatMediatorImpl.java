import java.util.ArrayList;

public class ChatMediatorImpl implements ChatMediator {
    private ArrayList<ChatClient> chatClients;
    public ChatMediatorImpl() {
        chatClients = new ArrayList<>();
    }

    @Override
    public void sendMessage(String sender, String message, String receiver) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(sender).append(": ").append(message).append("\n");
        for (ChatClient chatClient : chatClients) {
            if(chatClient.getUsername().equals(receiver)) {
                chatClient.receiveMessage(stringBuilder.toString());
                return;
            }
        }
    }

    @Override
    public void registerClient(ChatClient client) {
        chatClients.add(client);
        for (ChatClient chatClient : chatClients) {
            chatClient.rebuildChatClientOptions(chatClients);
        }
    }
}
