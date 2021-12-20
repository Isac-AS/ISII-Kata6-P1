package factories;

import toyproduct.Toy;

public abstract class ToyFactory {
    final protected SerialNumberGenerator generator = new SerialNumberGenerator();

    public Toy produceToy(String type) {
        Toy toy = this.createToy(type);
        toy.pack();
        toy.label();
        return toy;
    }

    protected abstract Toy createToy(String type);
}
