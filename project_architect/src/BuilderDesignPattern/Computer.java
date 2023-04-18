package BuilderDesignPattern;

public class Computer {

    //Required parameters
    private String ram;
    private String hdd;

    //Optional parameters
    private boolean isGraphicCardNeeded;
    private boolean isSoftwareNeeded;

    public String getRam() {
        return ram;
    }

    public String getHdd() {
        return hdd;
    }

    public boolean isGraphicCardNeeded() {
        return isGraphicCardNeeded;
    }

    public boolean isSoftwareNeeded() {
        return isSoftwareNeeded;
    }

    private Computer(ComputerBuilder builder) {
        this.hdd = builder.hdd;
        this.ram = builder.ram;
        this.isGraphicCardNeeded = builder.isGraphicCardNeeded;
        this.isSoftwareNeeded = builder.isSoftwareNeeded;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", isGraphicCardNeeded=" + isGraphicCardNeeded +
                ", isSoftwareNeeded=" + isSoftwareNeeded +
                '}';
    }

    public static class ComputerBuilder {

        //Required parameters
        private String ram;
        private String hdd;

        //Optional parameters
        private boolean isGraphicCardNeeded;
        private boolean isSoftwareNeeded;

        public ComputerBuilder(String ram, String hdd) {
            this.ram = ram;
            this.hdd = hdd;
        }

        public ComputerBuilder setGraphicCardNeeded(boolean isGraphicCardNeeded) {
            this.isGraphicCardNeeded = isGraphicCardNeeded;
            return this;
        }

        public ComputerBuilder setSoftwareNeeded(boolean isSoftwareNeeded) {
            this.isSoftwareNeeded = isSoftwareNeeded;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}