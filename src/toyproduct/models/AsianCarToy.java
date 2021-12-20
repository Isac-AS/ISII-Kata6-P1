package toyproduct.models;
import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentfactories.AsianComponentFactory;
import toyproduct.Toy;
import toyproduct.components.Engine;
import toyproduct.components.Wheel;

public class AsianCarToy implements Toy{
    final private Integer serialNumber;
    final private String type = "car";
    final ComponentFactory factory;
    private Engine engine;
    final private Wheel[] wheels = new Wheel[4];

    public AsianCarToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
        this.factory = new AsianComponentFactory();
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
        return "AsianCarToy{" + "serialNumber=" + serialNumber + '}';
    }
    
    @Override
    public void prepare() {
        this.engine = this.factory.createEngine();
        for (int i = 0; i < wheels.length - 1; i++) {
            this.wheels[i] = this.factory.createWheel();
        }
        System.out.printf("Preparing car '%d'\n", this.serialNumber);
    }
}
