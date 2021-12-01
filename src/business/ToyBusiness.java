package business;

import toyproduct.Toy;
import toyproduct.models.AmericanHelicopterToy;
import toyproduct.models.AmericanCarToy;

public abstract class ToyBusiness {

    final protected SerialNumberGenerator generator = new SerialNumberGenerator();

    public abstract Toy createToy(String type);
}
