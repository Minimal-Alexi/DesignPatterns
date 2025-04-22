public class FileTypeVisitor implements FileSystemVisitor{
    private String fileType;
    public FileTypeVisitor(String fileType) {
        this.fileType = fileType;
    }
    @Override
    public void visit(File file) {
        System.out.println("File: " + file.getFileName() + file.getFileType() + " matches searched type.");
    }

    @Override
    public void visit(Directory directory) {
        System.out.println("Searching directory: " + directory.getName());
    }
}
