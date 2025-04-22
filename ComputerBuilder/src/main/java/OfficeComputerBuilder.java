public class OfficeComputerBuilder implements ComputerBuilderI{
    private Computer computer;
    private int quality;
    public OfficeComputerBuilder(int quality) {
        computer = new Computer();
        this.quality = quality;
    }
    @Override
    public void buildCPU() {

    }

    @Override
    public void buildRAM() {

    }

    @Override
    public void buildHardDrive() {

    }

    @Override
    public void buildGPU() {

    }

    @Override
    public void buildOS() {

    }

    @Override
    public Computer getComputer() {
        return null;
    }
}
