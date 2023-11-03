package com.pixel.dp;

import lombok.Data;

public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        MenuItem menuItem = new MenuItem(100,"Bread","Wheat flour bread");
        BeverageItem beverageItem = new BeverageItem(60,"Coke","Cold Beverage");

        printItemPrice(menuItem);
        printItemPrice(beverageItem);
    }
    @Data
    public static class MenuItem {
        int price;
        private String name;
        private String description;

        public MenuItem(int price, String name, String description) {
            this.price = price;
            this.name = name;
            this.description = description;
        }

        public double getPrice() {
            return this.price - this.getDiscount(); // Access the 'price' field directly.
        }

        private double getDiscount() {
            return 0;
        }
    };
    public static class BeverageItem extends MenuItem {
        public BeverageItem(int price, String name, String description) {
            super(price, name, description);
        }
        @Override
        public double getPrice() {
            return this.price - this.getDiscount(); // Access the 'price' field directly.
        }

        private double getDiscount() {
            int discountPercent = 0;
            return discountPercent * 0.01 * this.price; // Access the 'price' field directly.
        }
    }
    public static void printItemPrice(MenuItem menuItem) {
        if (menuItem instanceof BeverageItem) {
            System.out.println("BeverageItem Price: ");
        } else {
            System.out.println("MenuItem Price: ");
        }
        System.out.println(menuItem.getPrice());
    }
}
