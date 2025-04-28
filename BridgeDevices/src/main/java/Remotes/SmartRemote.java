package Remotes;

import Devices.DeviceI;

public class SmartRemote extends AdvancedRemote{

    public SmartRemote(DeviceI device) {
        super(device);
    }
    public void voiceControl(String command, int value){
        switch(command){
            case "mute":
            {
                mute();
                break;
            }
            case "unmute":{
                device.setVolume(50);
                break;
            }
            case "change channel":{
                device.setChannel(value);
                break;
            }
            case "change volume":{
                device.setVolume(value);
                break;
            }
            default:{
                System.out.println("Unknown command");
            }
        }
    }
}
