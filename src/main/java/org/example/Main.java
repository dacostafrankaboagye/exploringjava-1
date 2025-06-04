package org.example;


public class Main {
    public static void main(String[] args) {

        Product laptop = new Product("Laptop", 1200.0, "Electronics");

        System.out.println(laptop.name()); // Laptop
        System.out.println(laptop.price()); // 1200.0
        System.out.println(laptop.category()); // Electronics

    }
}