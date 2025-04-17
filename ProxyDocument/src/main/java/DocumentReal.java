import java.sql.Timestamp;

public class DocumentReal implements Document {
    @Override
    public String getContent() {
        return "";
    }

    @Override
    public int getUID() {
        return 0;
    }

    @Override
    public Timestamp getCreationDate() {
        return null;
    }
}
