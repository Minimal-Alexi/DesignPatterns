public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("How to farm bananas","John Banana"), book2 = new Book("Women's Fashion","Minerva A"),
                book3 = new Book("Farmers' fashion","John Fashion");
        Recommendation farmerRecommendation = new Recommendation("Banana farmers"),
                fashionRecommendation = new Recommendation("Fashionistas");

        farmerRecommendation.addRecommendedBook(book1);
        farmerRecommendation.addRecommendedBook(book3);

        fashionRecommendation.addRecommendedBook(book2);
    }
}
