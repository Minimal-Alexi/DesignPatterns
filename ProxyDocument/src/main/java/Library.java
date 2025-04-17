import Document.*;

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
    public DocumentProxy secureDocument(DocumentReal realDocument) {
        return new DocumentProxy(realDocument);
    }
}
