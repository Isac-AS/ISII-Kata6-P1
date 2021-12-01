package toyproduct.models;

import toyproduct.Toy;

public class AsianHelicopterToy implements Toy{

    final private Integer serialNumber;
    final private String type = "helicopter";

    public AsianHelicopterToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public void pack() {
        System.out.printf("Packing helicopter '%d'\n", this.serialNumber);
    }

    @Override
    public void label() {
        System.out.printf("Labelling helicopter '%d'\n", this.serialNumber);
    }

    @Override
    public Integer getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "AsianHelicopterToy{" + "serialNumber=" + serialNumber + '}';
    }
}
