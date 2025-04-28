import Devices.DeviceI;
import Devices.Radio;
import Devices.SmartTv;
import Devices.Tv;
import Remotes.AdvancedRemote;
import Remotes.BasicRemote;

public class Main {
    public static void main(String[] args) {
        testDevice(new Radio());
        testDevice(new Tv());
        testDevice(new SmartTv());
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
    }}
