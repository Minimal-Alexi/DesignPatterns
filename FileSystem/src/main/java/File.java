public class File {
    private String fileName;
    private String fileType;
    private int fileSize; // kb
    public File(String fileName, String fileType, int fileSize) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileSize = fileSize;
    }
}
