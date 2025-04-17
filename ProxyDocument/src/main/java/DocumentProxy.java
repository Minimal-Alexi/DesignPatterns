import java.sql.Timestamp;

public class DocumentProxy implements Document{
    private final DocumentReal documentReal;
    private final AccessControlService accessControlService = AccessControlService.getInstance();
    public DocumentProxy(int UID, String content) {
        documentReal = new DocumentReal();
    }
    @Override
    public String getContent(User user) {
        if(accessControlService.isAllowed(documentReal.getUID(),user)){

        }
        return documentReal.getContent(user);
    }

    @Override
    public int getUID() {
        return documentReal.getUID();
    }

    @Override
    public Timestamp getCreationDate() {
        return documentReal.getCreationDate();
    }
}
