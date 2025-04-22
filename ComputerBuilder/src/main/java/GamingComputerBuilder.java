public class GamingComputerBuilder implements ComputerBuilderI{
    private Computer computer;
    private int quality;
    public GamingComputerBuilder(){
        computer = new Computer();
    }
    @Override
    public void setQuality(int quality){
        this.quality = quality;
    }
    @Override
    public void buildCPU() {
        computer.addComponent(new Component("RGB CPU",quality));
    }

    @Override
    public void buildRAM() {
        computer.addComponent(new Component("32 GB RAM",quality));
    }

    @Override
    public void buildHardDrive() {
        computer.addComponent(new Component("2 TB Pirate HDD",quality));
    }

    @Override
    public void buildGPU() {
        computer.addComponent(new Component("RTX 10090", quality));
    }

    @Override
    public void buildOS() {
        computer.addComponent(new Component("Arch-Linux",quality));
    }

    @Override
    public void buildPrepackagedSoftware() {
        computer.addComponent(new Component("Nvidia Geforce App",quality));
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
