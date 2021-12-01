package toys;

public class Helicopter {

    private Integer serialNumber;

    public Helicopter(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void pack() {
        System.out.printf("Packing helicopter '%d'\n", this.serialNumber);
    }

    public void label() {
        System.out.printf("Labelling helicopter '%d'\n", this.serialNumber);
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }
}
