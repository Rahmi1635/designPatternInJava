public interface ComputerBuilder {

    void setCpu(String cpu);
    void setRam(int ram);
    void setGpu(String gpu);
    void setDisc(int disc);
    void setBlueetoth(boolean blueetoth);

    Computer build();
}
