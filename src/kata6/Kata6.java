package kata6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toys.Car;
import toys.SerialNumberGenerator;

public class Kata6 {

    public static void main(String[] args) {
        SerialNumberGenerator generator = new SerialNumberGenerator();
        ArrayList<Car> cars = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        String line = "";
        while (!line.equals("exit")) {
            line = sc.nextLine();
            if (!line.equals("exit")) {
                Car car = new Car(generator.next());
                car.pack();
                car.label();
                cars.add(car);
                System.out.println("Built car with S/N: "+car.getSerialNumber());
                System.out.println(
                        "Built cars: "+cars.stream()
                                .map(c->c.getSerialNumber().toString())
                                .collect(Collectors.joining(", ")));
            }
        }
    }
}
