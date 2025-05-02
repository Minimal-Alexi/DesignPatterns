public class Book implements Prototype{
    private String title,author;
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    @Override
    public Book clone(){
        return new Book(title,author);
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String toString(){
        return "Book \""+title+"\" by "+author;
    }
}
