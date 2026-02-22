// PRODUCT SINIFI


public class Computer {

    private String cpu;
    private  int ram;
    private  String gpu;
    private int disc;
    private boolean hasBluetooth;

    public Computer()
    {
       
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public int getDisc() {
        return disc;
    }

    public void setDisc(int disk) {
        this.disc = disk;
    }

    public boolean getHasBluetooth() {
        return hasBluetooth;
    }

    public void setHasBluetooth(boolean hasBlueetoth) {
        this.hasBluetooth = hasBlueetoth;
    }

    public String toString()
    {
        return "Computer: {"+
                "cpu = "+ cpu +
                ", ram = "+ ram +
                ", gpu = "+ gpu +
                ", disk = " + disc +
                ", hasBlueetoth = "+hasBluetooth +
                "}";
    }
}
