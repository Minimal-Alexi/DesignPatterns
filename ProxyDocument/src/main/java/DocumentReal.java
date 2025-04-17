import java.sql.Timestamp;

public class DocumentReal implements Document {
    private String content;
    private Timestamp creationDate;
    private int id;
    public DocumentReal(String content, Timestamp creationDate, int id) {
        this.content = content;
        this.creationDate = creationDate;
        this.id = id;
    }
    @Override
    public String getContent(User user) {
        return content;
    }

    @Override
    public int getUID() {
        return id;
    }

    @Override
    public Timestamp getCreationDate() {
        return creationDate;
    }
}
