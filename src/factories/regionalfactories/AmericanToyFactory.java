package factories.regionalfactories;

import toyproduct.models.AmericanCarToy;
import toyproduct.models.AmericanHelicopterToy;
import factories.ToyFactory;
import toyproduct.Toy;

public class AmericanToyFactory extends ToyFactory{

    @Override
    public Toy createToy(String type) {
        switch (type) {
            case "car":
            case "Car":
                AmericanCarToy car = new AmericanCarToy(this.generator.next());
                return car;
            case "helicopter":
            case "Helicopter":
                AmericanHelicopterToy helicopter = new AmericanHelicopterToy(this.generator.next());
                return helicopter;
            default:
                System.out.println("Unknown type!");
                return null;
        }
    }
}
