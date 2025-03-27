import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger logger = new Logger();
    private String fileName;
    private FileWriter fileWriter;
    private Logger() {
        setFileName("log.txt");
    }
    public static synchronized Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }
    public synchronized void write(String message) {
        try {
            if(fileWriter == null) {
                fileWriter = new FileWriter(fileName, true);
            }
            fileWriter.write(message + "\r\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public synchronized void close() {
        try
        {
            if (fileWriter != null)
            {
                fileWriter.close();
                fileWriter = null;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public synchronized void setFileName(String fileName) {
        this.fileName = fileName;
        close();
    }
}
