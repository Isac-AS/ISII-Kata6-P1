package main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toys.Car;
import toys.Helicopter;
import toys.SerialNumberGenerator;

public class Main {

    public static void main(String[] args) {
        SerialNumberGenerator generator = new SerialNumberGenerator();
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Helicopter> helicopters = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        String line = "";
        while (!line.equals("exit")) {
            System.out.print("\nInserte el comando (car, helicopter o exit): ");
            line = sc.nextLine();
            if (!line.equals("exit")) {
                switch (line) {
                    case "car":
                    case "Car":
                        Car car = new Car(generator.next());
                        car.pack();
                        car.label();
                        cars.add(car);
                        System.out.println("Built car with S/N: "
                                + car.getSerialNumber());
                        System.out.println(
                                "Built cars: " + cars.stream()
                                        .map(c -> c.getSerialNumber().toString())
                                        .collect(Collectors.joining(", ")));
                        break;
                    case "helicopter":
                    case "Helicopter":
                        Helicopter helicopter = new Helicopter(generator.next());
                        helicopter.pack();
                        helicopter.label();
                        helicopters.add(helicopter);
                        System.out.println("Built helicopter with S/N: "
                                + helicopter.getSerialNumber());
                        System.out.println(
                                "Built helicopters: " + helicopters.stream()
                                        .map(h -> h.getSerialNumber().toString())
                                        .collect(Collectors.joining(", ")));
                        break;
                    default:
                        System.out.println("Command unknown!");
                        break;
                }
            }
        }
    }
}
