public class OfficeComputerBuilder implements ComputerBuilderI{
    private Computer computer;
    private int quality;
    public OfficeComputerBuilder() {
        computer = new Computer();
    }
    @Override
    public void setQuality(int quality){
        this.quality = quality;
    }
    @Override
    public void buildCPU() {
        computer.addComponent(new Component("Serious CPU",quality));
    }

    @Override
    public void buildRAM() {
        computer.addComponent(new Component("8 GB RAM",quality));
    }

    @Override
    public void buildHardDrive() {
        computer.addComponent(new Component("512 GB HDD",quality));
    }

    @Override
    public void buildGPU() {
        computer.addComponent(new Component("GTX 1080", quality));
    }

    @Override
    public void buildOS() {
        computer.addComponent(new Component("AppleOS",quality));
    }
    @Override
    public void buildPrepackagedSoftware() {
        computer.addComponent(new Component("Adobe Suite",quality));
    }
    @Override
    public Computer getComputer() {
        return computer;
    }
}
