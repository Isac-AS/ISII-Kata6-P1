package toys;

public class ToyBusiness {
    
    public SerialNumberGenerator generator = new SerialNumberGenerator();
    
    public Car createCar() {
        Car car = new Car(this.generator.next());
        car.pack();
        car.label();
        System.out.println("Built car with S/N: "
                                + car.getSerialNumber());
        return car;
    }
    
    public Helicopter createHelicopter() {
        Helicopter helicopter = new Helicopter(this.generator.next());
        helicopter.pack();
        helicopter.label();
        System.out.println("Built helicopter with S/N: "
                                + helicopter.getSerialNumber());
        return helicopter;
    }
    
}
