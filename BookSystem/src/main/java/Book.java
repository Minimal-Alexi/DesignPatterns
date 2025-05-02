public class Book implements Cloneable {
    private String title, author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public Book clone() {
        try {
            return (Book) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("This should not happen since we implement Cloneable", e);
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString() {
        return "Book \"" + title + "\" by " + author;
    }
}
