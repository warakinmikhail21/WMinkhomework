package org.example.hw;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Search for cold drinks");
        VendingMachineBottle vmBottle = new VendingMachineBottle();
        List<BottleOfWater> bottleList = new ArrayList<>(Arrays.asList(
                new BottleOfWater(prod.Cola.toString(), new BigDecimal(2), 0.5),

                new BottleOfWater(prod.Sprite.toString(), new BigDecimal(3), 0.45),

                new BottleOfWater(prod.Fanta.toString(), new BigDecimal(4), 0.43),

                new BottleOfWater("Aqua Minerale", new BigDecimal(1.5), 0.5)));
        vmBottle.initProduct(bottleList);
        System.out.println(vmBottle.getProduct("Aqua Minerale"));

        System.out.println("Search for hot drinks");
        VendingMachineHotDrinks vmHotDrinks = new VendingMachineHotDrinks();
        List<HotDrinks> hotDrinksList = new ArrayList<>(Arrays.asList(
                new HotDrinks("Coffee", new BigDecimal(3), 0.5, 70),

                new HotDrinks("Tea", new BigDecimal(1), 0.6, 60),

                new HotDrinks("Milk", new BigDecimal(3), 0.7, 50)));
        vmHotDrinks.initProduct(hotDrinksList);

        System.out.println("Search by name: " + vmHotDrinks.getProduct("Coffee"));
        System.out.println("Search by price: " + vmHotDrinks.getProduct(new BigDecimal(2.5)));
        System.out.println("Search by temperature: " + vmHotDrinks.getProduct(70));
    }

    enum prod {
        Cola,
        Sprite,
        Fanta,
    }
}
