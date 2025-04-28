public abstract class Device {
    protected RemoteI remote;
    protected String name;
    protected boolean enabled;
    protected int volume,channel;
    public Device(RemoteI remote,String name, int volume, int channel) {
        this.remote = remote;
        this.name = name;
        this.enabled = false;
        this.volume = volume;
        this.channel = channel;
    }
    public RemoteI getRemote() {
        return remote;
    }
    public boolean isEnabled() {
        return enabled;
    }
    public void enable(){
        enabled = true;
    }
    public void disable(){
        enabled = false;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
        } else this.volume = Math.max(volume, 0);
    }
    public int getChannel() {
        return channel;
    }
    public void setChannel(int channel) {
        if (channel > 0){
            this.channel = channel;
        }
    }
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm a " + name + " .");
        System.out.println("| I'm " + (enabled ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume + "%");
        System.out.println("| Current channel is " + channel);
        System.out.println("------------------------------------\n");
    }
}
