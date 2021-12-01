package toyproduct.models;
import toyproduct.Toy;

public class AmericanCarToy implements Toy{
    final private Integer serialNumber;
    final private String type = "car";

    public AmericanCarToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    @Override
    public void pack() {
        System.out.printf("Packing car '%d'\n", this.serialNumber);
    }
    
    @Override
    public void label() {
        System.out.printf("Labelling car '%d'\n", this.serialNumber);
    }

    @Override
    public Integer getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "AmericanCarToy{" + "serialNumber=" + serialNumber + '}';
    }
    
    
}
