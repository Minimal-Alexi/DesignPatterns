public class FileSizeVisitor implements FileSystemVisitor{
    private int totalSize;
    public FileSizeVisitor() {
        totalSize = 0;
    }
    @Override
    public void visit(File file) {
        totalSize += file.getFileSize();
    }

    @Override
    public void visit(Directory directory) {
        System.out.println("Searching directory: " + directory.getName());
    }
    public int getTotalSize() {
        return totalSize;
    }
}
