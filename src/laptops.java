public class laptops { //думал над полями в принципе, в "магазин" не включал
    private String label;
    private String model;
    private double size;
    private String os;
    private String color;
    private short hddSize;
    private short ssdSize;
    private byte ramSize;
    private String cpuType;
    private String gpuType;

    public laptops(String label, String model, double size, String os, String color,
                   short hddSize, short ssdSize, byte ramSize, String cpuType, String gpuType) {
        this.label = label;
        this.model = model;
        this.size = size;
        this.os = os;
        this.color = color;
        this.hddSize = hddSize;
        this.ssdSize = ssdSize;
        this.ramSize = ramSize;
        this.cpuType = cpuType;
        this.gpuType = gpuType;
    }

    public String getLabel() {
        return label;
    }

    public String getModel() {
        return model;
    }
    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public short getHddSize() {
        return hddSize;
    }

    public short getSsdSize() {
        return ssdSize;
    }

    public byte getRamSize() {
        return ramSize;
    }

    @Override
    public String toString() {
        return "\n Laptop: "+ label + " " + model + " " + size + " " + os + " " + color
                + " " + hddSize + " " + ssdSize + " " + ramSize + " " + cpuType
                + " " + gpuType + "\n";
    }
}
