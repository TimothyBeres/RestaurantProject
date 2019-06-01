package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "FoodItems")
public class FoodItem {
    private String id;
    private String foodName;
    private String description;
    public Double price;
    public String category;

    public FoodItem() {
    }

    public FoodItem(String foodName, String description, double price, String category) {
        this.foodName = foodName;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    @Id
    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory( String category) {
        this.category = category;
    }

    public String getName() {
        return foodName;
    }

    public void setName(String foodName) {
        this.foodName = foodName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
