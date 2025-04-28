package Devices;

public class SmartTv extends Tv{
    private int selectedWebsiteOption;
    private static final String[] websiteOptions = {"N/A","Youtube","Reddit","BlueSky"};
    public SmartTv(){
        super();
        selectedWebsiteOption = 0;
    }
    public void changeWebsiteOption(int option){
        selectedWebsiteOption = option;
    }
    public String getWebsiteOption(){
        return websiteOptions[selectedWebsiteOption];
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm smart TV set.");
        System.out.println("| I'm " + (on ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume + "%");
        System.out.println("| Current channel is " + channel);
        System.out.println("------------------------------------\n");
    }
}
