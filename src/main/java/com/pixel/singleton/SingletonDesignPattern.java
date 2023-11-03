package com.pixel.singleton;

public class SingletonDesignPattern {
    public static void main(String[] args) {
        President president = President.getInstance();
        System.out.println("Current President: " + president.getPresidentName());

        president.electPresident("John Doe");
        System.out.println("Current President: " + president.getPresidentName());

        President president2 = President.getInstance();
        System.out.println("Current President (from another reference): " + president2.getPresidentName());


        // Determine the winner
        String currentPresidentName = president.getPresidentName();
        if ("No President Elected Yet".equals(currentPresidentName)) {
            System.out.println("No winner yet. An election has not occurred.");
        } else {
            System.out.println("The winner is: " + currentPresidentName);
        }
    }
}
class President {
    private static President instance;
    private String presidentName;

    private President() {
        // Initialize the president's name to an initial value
        this.presidentName = "No President Elected Yet";
    }

    public static President getInstance() {
        if (instance == null) {
            instance = new President();
        }
        return instance;
    }

    public void electPresident(String name) {
        presidentName = name;
        System.out.println(name + " is elected as the President.");
    }

    public String getPresidentName() {
        return presidentName;
    }
    }
