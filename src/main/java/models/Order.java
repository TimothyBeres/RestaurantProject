package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "Orders")
public class Order {

    private String id;
    private String clientName;
    private String offerId;
    private BigDecimal orderPrice;

    @OneToMany
    private List<FoodItem> foodItems;

    public Order() {

    }

    public Order(String clientName, List<FoodItem> foodItems, BigDecimal orderPrice) {
        this.clientName = clientName;
        this.foodItems = foodItems;
//this.orderPrice = foodItems.stream().map(foodItems -> foodItems.getPrice()).sum();
        //this.orderPrice = foodItems.stream().mapToLong(FoodItem::getPrice).sum();
    }


    @Id
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

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal offerPrice) {
        this.orderPrice = offerPrice;
    }

    public List<FoodItem> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(List<FoodItem> foodItems) {
        this.foodItems = foodItems;
    }
}
