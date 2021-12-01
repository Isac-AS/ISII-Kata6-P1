package main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproduct.Toy;
import toyproduct.models.CarToy;
import toyproduct.models.HelicopterToy;
import toys.SerialNumberGenerator;
import toys.ToyBusiness;

public class Main {

    public static void main(String[] args) {
        SerialNumberGenerator generator = new SerialNumberGenerator();
        ArrayList<Toy> toys = new ArrayList<>();

        ToyBusiness business = new ToyBusiness();
        
        Scanner sc = new Scanner(System.in);
        String line = "";
        while (!line.equals("exit")) {
            System.out.print("\nInserte el comando (car, helicopter o exit): ");
            line = sc.nextLine();
            if (!line.equals("exit")) {
                switch (line) {
                    case "car":
                    case "Car":
                    case "helicopter":
                    case "Helicopter":
                        toys.add(business.createToy(line));
                        System.out.println(
                                "Built toys: " + toys.stream()
                                        .map(h -> h.toString())
                                        .collect(Collectors.joining(", ")));
                        break;
                    default:
                        System.out.println("Command unknown!");
                        break;
                }
            }
        }
        System.out.println("Exiting...");
    }
}
