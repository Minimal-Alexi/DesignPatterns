import java.nio.file.AccessDeniedException;
import java.sql.Timestamp;

public interface Document {
    String getContent(User user) throws AccessDeniedException;
    int getUID();
    Timestamp getCreationDate();
}
