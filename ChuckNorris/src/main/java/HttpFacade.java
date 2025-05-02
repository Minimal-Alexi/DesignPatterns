import java.io.IOException;

public class HttpFacade {
    private HttpClient httpClient;
    public HttpFacade() {
        httpClient = new HttpClient();
    }
    public String getAttributeValueFromJson(String urlString, String attributeName) throws IllegalArgumentException, IOException {
        return "wtf";
    }
}
