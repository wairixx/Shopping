import Shops.Product;
import Shops.ProductShop;
import Shops.Shop;
import Shops.TechnicShop;

import java.util.ArrayList;

public class Husband {
    private ArrayList<Product> listOfProducts;

    private ArrayList<Shop> shops = new ArrayList<>();

    private double money;
    private double spentMoney = 0;

    public Husband(double money) {
        this.shops = getListOfShops();
        this.money = 3000;
    }

    private ArrayList<Shop> getListOfShops() {

        Shop Technics = new TechnicShop();
        shops.add(Technics);
        Shop Products = new ProductShop();
        shops.add(Products);
        return shops;
    }

    public void getListFromWife(ArrayList<Product> listOfProducts) {

        this.listOfProducts = listOfProducts;

    }

    public ArrayList<Product> createListOfAllProductsFromShops() {
        ArrayList<Product> allProductsFromShops = new ArrayList<>();

        for (Shop shop : shops) {
            allProductsFromShops.addAll(shop.getAllProductsFromShops());

        }
        return allProductsFromShops;
    }

    public ArrayList<Product> boughtProducts() {
        ArrayList<Product> listOfBoughtProducts = new ArrayList<>();
        double priceWithoutDiscount = 0;
        for (Shop shop: shops){
            for (Product product : shop.getProducts(listOfProducts)) {
                priceWithoutDiscount += product.getPrice();
                if (money > priceWithoutDiscount) {
                    listOfBoughtProducts.add(product);
                }
            }
        }
        return listOfBoughtProducts;
    }


    public double priceOfProductsWithoutDiscount() {
        double priceWithoutDiscount = 0;
        for (Shop shop: shops){
            for (Product product : shop.getProducts(listOfProducts)) {
                priceWithoutDiscount += product.getPrice();
                if (money < priceWithoutDiscount) {
                    priceWithoutDiscount = priceWithoutDiscount - product.getPrice();
                }
            }
        }
        return priceWithoutDiscount;
    }
    public void priceOfProductsWithDiscount() {

        for (Shop shop : shops) {
            for (Product foundProduct : shop.getProducts(listOfProducts)) {

                spentMoney += shop.buyProducts(foundProduct);
                if (money < spentMoney) {
                    spentMoney = spentMoney - foundProduct.getPrice();
                }
            }
        }
        money = money - spentMoney;
    }

    public double getSpentMoney() {
        return spentMoney;
    }
    public double getMoney() {
        return money;
    }
}