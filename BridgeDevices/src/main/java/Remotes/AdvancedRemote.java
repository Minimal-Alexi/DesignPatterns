package Remotes;

import Devices.DeviceI;

public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(DeviceI device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
