package main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproduct.Toy;
import factories.SerialNumberGenerator;
import business.ToyBusiness;
import factories.regionalfactories.AmericanToyFactory;

public class Main {

    public static void main(String[] args) {
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
                    business = new ToyBusiness(new AmericanToyFactory());
                    break;
                case "America":
                case "america":
                    business = new ToyBusiness(new AmericanToyFactory());
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
                        toys.add(business.produceToy(line));
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
