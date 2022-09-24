import Shops.Product;

import java.util.ArrayList;

public class Wife {

    private ArrayList<Product> listOfAllProductsFromHusband;
    private ArrayList<Product> listOfFoundProductsFromHusband;
    private double spentMoneyWithoutDiscount;
    private double spentMoneyWithDiscount;
    private double money;


    Product milk = new Product("Milk");
    Product butter = new Product("Butter");
    Product apples = new Product("Apples");
    Product sonyTV = new Product("SonyTV");
    Product macbook = new Product("MacBook");


    public ArrayList<Product> createListOfProducts() {
        ArrayList<Product> neededProducts = new ArrayList<>();
        neededProducts.add(macbook);
        neededProducts.add(milk);
        neededProducts.add(butter);
        neededProducts.add(sonyTV);
        neededProducts.add(apples);
        System.out.println("List of products from wife:");
        for (Product product : neededProducts) {
            System.out.println("name='" + product.getName() + '\'');
        }
        return neededProducts;


    }


    public void takeListOfAllProductsFromHusband(ArrayList<Product> listOfAllProductsFromHusband) {
        this.listOfAllProductsFromHusband = listOfAllProductsFromHusband;
    }

    public void printToConsoleTotalList() {
        System.out.println("\n" + "List of all products:");
        for (Product product : listOfAllProductsFromHusband) {
            System.out.println(product.toString());
        }
    }


    public void takeListOfFoundProductsFromHusband(ArrayList<Product> listOfFoundProductsFromHusband) {
        this.listOfFoundProductsFromHusband = listOfFoundProductsFromHusband;
    }

    public void printToConsoleListOfFoundProducts() {
        System.out.println("\n" + "Bought products:");
        for (Product product : listOfFoundProductsFromHusband) {
            System.out.println(product.toString());
        }
    }

    public void takeSpentMoneyWithoutDiscount(double spentMoneyWithoutDiscount) {
        this.spentMoneyWithoutDiscount = spentMoneyWithoutDiscount;
    }

    public void takeSpentMoneyWithDiscount(double spentMoneyWithDiscount) {
        this.spentMoneyWithDiscount = spentMoneyWithDiscount;
    }
    public void takeMoney(double money) {
        this.money = money;
    }

    public void printToConsoleInfoAboutMoney() {
        System.out.println("\n" + "Spent money without discount - " + this.spentMoneyWithoutDiscount);
        System.out.println("\n" + "Spent money with discount - " + this.spentMoneyWithDiscount);
        System.out.println("\n" + "Change - " + this.money );
    }
}

