import java.util.ArrayList;

public class Directory implements FileSystemElement{
    private String name;
    private ArrayList<FileSystemElement> files;
    public Directory(String name) {
        this.name = name;
        files = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void addElement(FileSystemElement element) {
        files.add(element);
    }
    public void removeElement(int index) {
        files.remove(index);
    }
    @Override
    public void accept(FileSystemVisitor visitor) {
        for (FileSystemElement element : files) {
            element.accept(visitor);
        }
    }
}
