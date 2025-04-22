public class ComputerDirector {
    ComputerBuilderI builder;
    public ComputerDirector(ComputerBuilderI builder) {
        this.builder = builder;
    }
    public void buildBadComputer() {
        builder.setQuality(1);
        builder.buildCPU();
        builder.buildRAM();
        builder.buildHardDrive();
        builder.buildOS();
    }
    public void buildAverageComputer() {
        builder.setQuality(3);
        builder.buildCPU();
        builder.buildGPU();
        builder.buildRAM();
        builder.buildHardDrive();
        builder.buildOS();
    }
    public void buildGoodComputer() {
        builder.setQuality(5);
        builder.buildCPU();
        builder.buildGPU();
        builder.buildRAM();
        builder.buildHardDrive();
        builder.buildOS();
        builder.buildPrepackagedSoftware();
    }
    public Computer getComputer() {
        return builder.getComputer();
    }

}
