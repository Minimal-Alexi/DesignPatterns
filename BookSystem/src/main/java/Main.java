public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("How to farm bananas","John Banana"), book2 = new Book("Women's Fashion","Minerva A"),
                book3 = new Book("Farmers' fashion","John Fashion");
        Recommendation farmerRecommendation = new Recommendation("Banana farmers"),
                fashionRecommendation = new Recommendation("Fashionistas");

        farmerRecommendation.addRecommendedBook(book1);
        farmerRecommendation.addRecommendedBook(book3);

        fashionRecommendation.addRecommendedBook(book2);
        System.out.println("Initial lists.");
        System.out.println(farmerRecommendation);
        System.out.println(fashionRecommendation);

        Recommendation fashionableFarmerRecommendation = fashionRecommendation.clone();
        fashionableFarmerRecommendation.setTargetAudience("Fashionable farmer");
        System.out.println("Let's copy the fashion recommendation and make a fashionable farmer recommendation.");
        System.out.println(fashionableFarmerRecommendation);
        System.out.println(fashionRecommendation);

        System.out.println("Let's differentiate the two recommendations more.");
        fashionableFarmerRecommendation.addRecommendedBook(book3);
        book2.setAuthor("Minerva-Alexia");
        System.out.println(fashionableFarmerRecommendation);
        System.out.println(fashionRecommendation);
    }
}
