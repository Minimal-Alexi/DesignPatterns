package Remotes;

import Devices.Device;

public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device) {
        super(device);
    }
    public void mute(){
        System.out.println("Remote: Mute");
        device.setVolume(0);
    }
}
