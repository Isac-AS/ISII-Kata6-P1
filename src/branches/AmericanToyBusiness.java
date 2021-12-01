package branches;

import toyproduct.models.AmericanCarToy;
import toyproduct.models.AmericanHelicopterToy;
import business.ToyBusiness;
import toyproduct.Toy;

public class AmericanToyBusiness extends ToyBusiness{

    @Override
    public Toy createToy(String type) {
        switch (type) {
            case "car":
            case "Car":
                AmericanCarToy car = new AmericanCarToy(this.generator.next());
                car.pack();
                car.label();
                return car;
            case "helicopter":
            case "Helicopter":
                AmericanHelicopterToy helicopter = new AmericanHelicopterToy(this.generator.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;
            default:
                System.out.println("Unknown type!");
                return null;
        }
    }
}
