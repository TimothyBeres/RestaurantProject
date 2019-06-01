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
    public BigDecimal price;

    public FoodItem() {
    }

    public FoodItem(String foodName, String description, BigDecimal price) {
        this.foodName = foodName;
        this.description = description;
        this.price = price;
    }

    @Id
    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
