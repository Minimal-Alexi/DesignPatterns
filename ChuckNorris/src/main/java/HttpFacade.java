import java.io.IOException;

public class HttpFacade {
    private HttpClient httpClient;
    public HttpFacade() {
        httpClient = new HttpClient();
    }
    public String getAttributeValueFromJson(String urlString, String attributeName) throws IllegalArgumentException, IOException {
        String jsonResult,attributeValue;
        try {
            jsonResult = httpClient.getJsonFromApi(urlString);
        } catch (Exception e) {
            throw new IOException(e);
        }
        try{
            attributeValue = httpClient.extractAttributeFromJson(jsonResult, attributeName);
        }catch (Exception e){
            throw new IllegalArgumentException();
        }
        return attributeValue;
    }
}
