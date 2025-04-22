public interface ComputerBuilderI {
    public void setQuality(int quality);
    public void buildCPU();
    public void buildRAM();
    public void buildHardDrive();
    public void buildGPU();
    public void buildOS();
    public Computer getComputer();
    public void restartBuild();
}
