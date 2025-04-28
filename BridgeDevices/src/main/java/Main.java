import Devices.DeviceI;
import Devices.Radio;
import Devices.SmartTv;
import Devices.Tv;
import Remotes.AdvancedRemote;
import Remotes.BasicRemote;
import Remotes.SmartRemote;

public class Main {
    public static void main(String[] args) {
        testDevice(new Radio());
        testDevice(new Tv());
        testDevice(new SmartTv());
        System.out.println("\n\n\n");
        SmartTv smartTv = new SmartTv();
        smartTv.changeWebsiteOption(1);
        smartTv.printStatus();
        smartTv.changeWebsiteOption(2);
        smartTv.printStatus();
    }
    public static void testDevice(DeviceI device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();

        System.out.println("Tests with smart remote.");
        SmartRemote smartRemote = new SmartRemote(device);
        smartRemote.power();
        smartRemote.mute();
        smartRemote.voiceControl("unmute",0);
        smartRemote.voiceControl("change channel",3);
        device.printStatus();
    }}
