package main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproduct.Toy;
import business.ToyBusiness;
import factories.regionalfactories.AmericanCarToyFactory;
import factories.regionalfactories.AmericanHelicopterToyFactory;
import factories.regionalfactories.AmericanSubmarineToyFactory;
import factories.regionalfactories.AsianCarToyFactory;
import factories.regionalfactories.AsianHelicopterToyFactory;
import factories.regionalfactories.AsianSubmarineToyFactory;

public class Main {

    public static void main(String[] args) {
        ToyBusiness business = new ToyBusiness();

        ArrayList<Toy> toys = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        String line = "";

        while (!line.equals("Asia") && !line.equals("asia") && !line.equals("America") && !line.equals("america")) {
            System.out.print("\n¿En qué región se va a trabajar? (Asia o America): ");
            line = sc.nextLine();
            switch (line) {
                case "Asia":
                case "asia":
                    business.add("car", new AsianCarToyFactory());
                    business.add("helicopter", new AsianHelicopterToyFactory());
                    business.add("submarine", new AsianSubmarineToyFactory());
                    break;
                case "America":
                case "america":
                    business.add("car", new AmericanCarToyFactory());
                    business.add("helicopter", new AmericanHelicopterToyFactory());
                    business.add("submarine", new AmericanSubmarineToyFactory());
                    break;
                default:
                    System.out.println("Region incorrecta. Inténtelo de nuevo.");
                    break;
            }
        }

        while (!line.equals("exit")) {
            System.out.print("\nInserte el comando (car, helicopter, submarine o exit): ");
            line = sc.nextLine();
            if (!line.equals("exit")) {
                switch (line) {
                    case "car":
                    case "Car":
                    case "helicopter":
                    case "Helicopter":
                    case "submarine":
                    case "Submarine":
                        toys.add(business.produceToy(line.toLowerCase()));
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
