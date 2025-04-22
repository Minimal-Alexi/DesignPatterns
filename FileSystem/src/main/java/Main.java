public class Main {
    private static Directory mainDirectory;
    public static void main(String[] args) {
        directoryInitialization();
        FileSizeVisitor fileSizeVisitor = new FileSizeVisitor();

        mainDirectory.accept(fileSizeVisitor);
        System.out.println("Total system size: " + fileSizeVisitor.getTotalSize());

        FileTypeVisitor fileTypeVisitorC = new FileTypeVisitor(".cpp"),fileTypeVisitorMD = new FileTypeVisitor(".md");
        mainDirectory.accept(fileTypeVisitorC);
        mainDirectory.accept(fileTypeVisitorMD);
    }
    public static void directoryInitialization(){
        // Directory initialization
        mainDirectory = new Directory("Test");
        Directory directory2 = new Directory("First Folder"), directory3 = new Directory("Lol");
        mainDirectory.addElement(directory2);
        mainDirectory.addElement(directory3);

        // File initialization
        File file1 = new File("lol",".md",241),file2 = new File("main",".cpp",150),
                file3 = new File("helper",".cpp",1024),file4 = new File("readme",".md",2048),
                file5 = new File("homework",".txt",4096),file6 = new File("Watermelon",".jpg",9502);
        mainDirectory.addElement(file1);
        mainDirectory.addElement(file6);
        directory2.addElement(file2);
        directory2.addElement(file3);
        directory2.addElement(file4);

        directory3.addElement(file5);
    }
}
