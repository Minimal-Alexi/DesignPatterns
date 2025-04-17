import java.sql.Timestamp;

public class DocumentReal implements Document {
    private String content;
    private Timestamp creationDate;
    private int id;
    @Override
    public String getContent() {
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
