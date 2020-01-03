package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static int money = 550;
    public static int water = 1200;
    public static int milk = 540;
    public static int coffeeBeans = 120;
    public static int disCups = 9;
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printStats();
        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            switch (scanner.next()) {
                case "buy":
                    buyCoffee();
                    printStats();

                    break;
                case "fill":
                    fillMachine();
                    printStats();
                    break;
                case "take":
                    takeMoney();
                    printStats();
                    break;
            }
        } while(!scanner.next().equalsIgnoreCase("exit"));
    }

    public static void buyCoffee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        switch (scanner.nextInt()) {
            case 1:
                water -= 250;
                coffeeBeans -= 16;
                money += 4;
                disCups -= 1;
                break;
            case 2:
                water -= 350;
                milk -= 75;
                coffeeBeans -= 20;
                money += 7;
                disCups -= 1;
                break;
            case 3:
                water -= 200;
                milk -= 100;
                coffeeBeans -= 12;
                money += 6;
                disCups -= 1;
                break;
        }
    }

    public static void fillMachine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        water += scanner.nextInt();

        System.out.println("Write how many ml of milk do you want to add:");
        milk += scanner.nextInt();

        System.out.println("Write how many grams of coffee beans do you want to add:");
        coffeeBeans += scanner.nextInt();

        System.out.println("Write how many disposable cups of coffee do you want to add:");
        disCups += scanner.nextInt();
    }

    public static void takeMoney() {
        System.out.println("I gave you $" + money);
        money = 0;
    }

    public static void printStats() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(disCups + " of disposable cups");
        System.out.println(money + " of money");
    }
}

