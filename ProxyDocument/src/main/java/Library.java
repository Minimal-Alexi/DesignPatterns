import Document.*;

import java.sql.Timestamp;
import java.util.ArrayList;

public class Library {
    private ArrayList<Document> documentLibrary;
    public Library() {
        documentLibrary = new ArrayList<Document>();
    }
    public void addDocument(Document document) {
        documentLibrary.add(document);
    }
    public void removeDocument(Document document) {
        documentLibrary.remove(document);
    }
    public Document getDocument(int index) {
        return documentLibrary.get(index);
    }
    public DocumentReal createUnsecureDocument(int UID, String content){
        return new DocumentReal(content,new Timestamp(System.currentTimeMillis()),UID);
    }
    public DocumentProxy createSecureDocument(int UID, String content) {
        DocumentReal realDocument = createUnsecureDocument(UID, content);
        return new DocumentProxy(realDocument);
    }
}
