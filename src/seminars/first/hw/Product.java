package seminars.first.hw;

import java.util.List;

public class Product {
    private int cost; // Стоимость продукта
    private String title; // Название

    public Product(String title, int cost) {
        this.title = title;
        this.cost = cost;
    }

    public int getCost() { return cost; }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}