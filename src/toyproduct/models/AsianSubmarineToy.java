package toyproduct.models;

import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentfactories.AsianComponentFactory;
import toyproduct.Toy;
import toyproduct.components.Engine;

public class AsianSubmarineToy implements Toy{
    
    final private Integer serialNumber;
    final private String type = "submarine";
    final ComponentFactory factory;
    private Engine engine;

    public AsianSubmarineToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
        this.factory = new AsianComponentFactory();
    }
    
    @Override
    public void pack() {
        System.out.printf("Packing submarine '%d'\n", this.serialNumber);
    }

    @Override
    public void label() {
        System.out.printf("Labelling submarine '%d'\n", this.serialNumber);
    }

    @Override
    public Integer getSerialNumber() {
        return serialNumber;
    }
    
    @Override
    public String toString() {
        return "AsianSubmarineToy{" + "serialNumber=" + serialNumber + '}';
    }
    
    @Override
    public void prepare() {
        this.engine = this.factory.createEngine();
        System.out.printf("Preparing submarine '%d'\n", this.serialNumber);
    }
}
