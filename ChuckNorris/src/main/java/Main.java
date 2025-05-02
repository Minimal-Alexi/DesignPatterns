public class Main {
    private static final String[] links = {"https://api.chucknorris.io/jokes/random","https://api.fxratesapi.com/latest"};
    public static void main(String[] args) {
        HttpFacade facade = new HttpFacade();
        try{
            String chuckNorrisJoke = facade.getAttributeValueFromJson(links[0],"value");
            System.out.println("Something funny: " + chuckNorrisJoke);
            String muhEconomy = facade.getAttributeValueFromJson(links[1],"base");
            System.out.println("Something less funny: " + muhEconomy);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
