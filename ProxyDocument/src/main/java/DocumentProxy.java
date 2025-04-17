import java.nio.file.AccessDeniedException;
import java.sql.Timestamp;

public class DocumentProxy implements Document{
    private final DocumentReal documentReal;
    private final AccessControlService accessControlService = AccessControlService.getInstance();
    public DocumentProxy(DocumentReal documentReal) {
        this.documentReal = documentReal;
    }
    @Override
    public String getContent(User user) throws AccessDeniedException {
        if(accessControlService.isAllowed(documentReal.getUID(),user)){
            return documentReal.getContent(user);
        }
        else{
            throw new AccessDeniedException("Access denied to user: " + user.getUsername() + " for document UID: " + documentReal.getUID());
        }
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
