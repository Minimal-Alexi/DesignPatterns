package Devices;

public class SmartTv extends Tv{
    private int websiteChoice;
    private final static String[] websites = {"Youtube","Bluesky","Reddit"};
    public SmartTv(String name) {
        super( "Smart " + name);
    }
    public int getWebsitePosition(){
        return websiteChoice;
    }
    public String getWebsiteChoice() {
        return websites[websiteChoice];
    }
    public void setWebsiteChoice(int websiteChoice) {
        this.websiteChoice = websiteChoice;
    }
}
