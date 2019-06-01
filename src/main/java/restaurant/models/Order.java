package restaurant.models;

import restaurant.helpers.HelperClass;

import javax.persistence.*;
import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String clientName;
    private String offerId;
    private Double orderPrice;

    @ManyToMany
    private List<FoodItem> foodItems;

    public Order() {

    }

    public Order(String clientName, List<FoodItem> foodItems) {
        this.clientName = clientName;
        this.foodItems = foodItems;
        this.orderPrice = HelperClass.calculateOrderPrice(foodItems);
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double offerPrice) {
        this.orderPrice = offerPrice;
    }

    public List<FoodItem> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(List<FoodItem> foodItems) {
        this.foodItems = foodItems;
    }
}
