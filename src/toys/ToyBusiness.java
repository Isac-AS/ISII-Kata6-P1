package toys;

import toyproduct.Toy;
import toyproduct.models.HelicopterToy;
import toyproduct.models.CarToy;

public class ToyBusiness {

    public SerialNumberGenerator generator = new SerialNumberGenerator();

    public Toy createToy(String type) {
        switch (type) {
            case "car":
            case "Car":
                CarToy car = new CarToy(this.generator.next());
                car.pack();
                car.label();
                return car;
            case "helicopter":
            case "Helicopter":
                HelicopterToy helicopter = new HelicopterToy(this.generator.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;
            default:
                System.out.println("Unknown type!");
                return null;
        }
    }
}
