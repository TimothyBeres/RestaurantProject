package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FoodItems")
public class FoodItem {
    private String id;
    private String foodName;
    private String description;

    public FoodItem(String foodName, String description) {
        this.foodName = foodName;
        this.description = description;
    }

    @Id
    public String getID() {
        return this.id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getName() {
        return this.foodName;
    }

    public void setName(String foodName) {
        this.foodName = foodName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
