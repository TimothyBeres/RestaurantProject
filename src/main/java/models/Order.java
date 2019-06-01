package models;

import helpers.HelperClass;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "Orders")
public class Order {

    @Id private String id;
    private String clientName;
    private String offerId;
    private Double orderPrice;

    @ElementCollection
    private List<String> foodItems;

    public Order() {

    }

    public Order(String clientName, List<String> foodItems) {
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

    public List<String> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(List<String> foodItems) {
        this.foodItems = foodItems;
    }
}
