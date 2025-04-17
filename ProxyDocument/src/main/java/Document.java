import java.sql.Timestamp;

public interface Document {
    String getContent();
    int getUID();
    Timestamp getCreationDate();
}
