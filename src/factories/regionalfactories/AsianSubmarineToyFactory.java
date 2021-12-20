package factories.regionalfactories;

import factories.ToyFactory;
import toyproduct.Toy;
import toyproduct.models.AsianSubmarineToy;

public class AsianSubmarineToyFactory extends ToyFactory{
    @Override
    public Toy createToy(Integer serialNumber) {
        return new AsianSubmarineToy(serialNumber);
    }
}
