import java.util.ArrayList;

public class Directory {
    private String name;
    private ArrayList<FileSystemElement> files;
    public Directory(String name) {
        this.name = name;
        files = new ArrayList<>();
    }
}
