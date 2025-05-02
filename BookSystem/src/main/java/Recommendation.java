import java.util.ArrayList;

public class Recommendation implements Prototype{
    private String targetAudience;
    private ArrayList<Book> recommendedBooks;
    public Recommendation(String targetAudience) {
        this.targetAudience = targetAudience;
        this.recommendedBooks = new ArrayList<>();
    }
    public Recommendation clone() {
        try{
            Recommendation clonedRecommendation = (Recommendation) super.clone();
            clonedRecommendation.targetAudience = this.targetAudience;
            clonedRecommendation.recommendedBooks = new ArrayList<>();
            for(Book book : this.recommendedBooks){
                clonedRecommendation.addRecommendedBook(book.clone());
            }
            return clonedRecommendation;
        }catch(CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
    public String getTargetAudience() {
        return targetAudience;
    }
    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }
    public ArrayList<Book> getRecommendedBooks() {
        return recommendedBooks;
    }
    public void addRecommendedBook(Book recommendedBook) {
        this.recommendedBooks.add(recommendedBook);
    }
    public void removeRecommendedBook(Book recommendedBook) {
        this.recommendedBooks.remove(recommendedBook);
    }
}
