package main;

import branches.AmericanToyBusiness;
import branches.AsianToyBusiness;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproduct.Toy;
import business.SerialNumberGenerator;
import business.ToyBusiness;

public class Main {

    public static void main(String[] args) {
        SerialNumberGenerator generator = new SerialNumberGenerator();
        ArrayList<Toy> toys = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        String line = "";
        ToyBusiness business = null;
        while (business == null) {
            System.out.print("\n¿En qué región se va a trabajar? (Asia o America): ");
            line = sc.nextLine();
            switch (line) {
                case "Asia":
                case "asia":
                    business = new AsianToyBusiness();
                    break;
                case "America":
                case "america":
                    business = new AmericanToyBusiness();
                    break;
                default:
                    System.out.println("Region incorrecta. Inténtelo de nuevo.");
                    break;
            }
        }

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
