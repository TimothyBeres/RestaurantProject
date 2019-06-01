package restaurant.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class FoodItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String foodName;
    private String description;
    private Double price;
    private String category;
    @ManyToMany
    private List<OfferItem> offerItems;
    @ManyToMany
    private List<Order> orders;

    public FoodItem() {
    }

    public FoodItem(String foodName, String description, double price, String category) {
        this.foodName = foodName;
        this.description = description;
        this.price = price;
        this.category = category;
    }

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
    public List<OfferItem> getOfferItems(){return this.offerItems;}
    public void setOfferItems(List<OfferItem> offerItems){
        this.offerItems = offerItems;
    }
    public List<Order> getOrders(){return this.orders;}
    public void setOrders(List<Order> orders){this.orders = orders;}
}
