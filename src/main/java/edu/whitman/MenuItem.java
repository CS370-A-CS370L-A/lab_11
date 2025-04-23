package edu.whitman;

public class MenuItem {

    private String name;
    private int priceInCents;
    private String category;

    public MenuItem(String name, int priceInCents, String category) {
        this.name = name;
        this.priceInCents = priceInCents;
        this.category = category;
    }

    public String getPrice() {
        return "";
    }

    public String getPrice(int width) {
        return "";
    }

    public String getCategory(){
        return "";
    }

    public String getName(){
        return "";
    }

    public int getPriceInCents(){
        return 0;
    }

    @Override
    public String toString() {
        return "";
    }

}