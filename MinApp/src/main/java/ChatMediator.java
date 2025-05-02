public interface ChatMediator {
    public void sendMessage(String sender,String message,String receiver);
    public void registerClient(ChatClient client);
}
