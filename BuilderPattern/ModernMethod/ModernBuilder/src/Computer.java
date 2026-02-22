public final class Computer {

    private final String cpu;
    private final int ram;
    private final String gpu;
    private final int disc;
    private final boolean hasBluetooth;

    private Computer(Builder builder)
    {
        this.cpu= builder.cpu;
        this.ram=builder.ram;
        this.gpu=builder.gpu;
        this.disc=builder.disc;
        this.hasBluetooth=builder.hasBluetooth;
    }

    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public String getGpu() {
        return gpu;
    }

    public int getDisc() {
        return disc;
    }

    public boolean isHasBluetooth() {
        return hasBluetooth;
    }

    @Override
    public String toString() {
        return "Computer {" +
                "cpu= "+cpu+ '\''+
                ", ram= "+ram+'\''+
                ", gpu= "+gpu+'\''+
                ", disc= "+disc+'\''+
                ", hasBluetooth= "+hasBluetooth+
                '}';


    }

    public Builder toBuilder()
    {
        return new Builder(this.cpu,this.ram)
                .gpu(this.gpu)
                .disc(this.disc)
                .hasBluetooth(this.hasBluetooth);
    }

    public static class Builder{

        private final String cpu;
        private final int ram;

        private String gpu="Integrated Graphics";
        private int disc=256;
        private boolean hasBluetooth=false;

        public Builder(String cpu,int ram)
        {
            if(cpu==null || cpu.isBlank())
            {
                throw new IllegalArgumentException("CPU must not be null or blank");
            }
            if(ram<=0)
            {
                throw new IllegalArgumentException("RAM must be positive");
            }

            this.cpu=cpu;
            this.ram=ram;
        }

        public Builder gpu(String gpu)
        {
            this.gpu=gpu;
            return this;
        }

        public Builder disc(int disc)
        {
            if (disc <= 0) {
                throw new IllegalArgumentException("Disk must be positive");
            }
            this.disc=disc;
            return this;
        }

        public Builder hasBluetooth(boolean value) {
            this.hasBluetooth = value;
            return this;
        }

        public Computer build()
        {
            return new Computer(this);
        }

    }
}
