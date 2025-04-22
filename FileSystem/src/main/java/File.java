public class File implements FileSystemElement{
    private String fileName;
    private String fileType;
    private int fileSize; // kb
    public File(String fileName, String fileType, int fileSize) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileSize = fileSize;
    }
    public String getFileName(){
        return fileName;
    }
    public int getFileSize(){
        return fileSize;
    }
    public String getFileType(){
        return fileType;
    }
}
