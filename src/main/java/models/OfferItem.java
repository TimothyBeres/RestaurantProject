package models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "OfferItems")
public class OfferItem {

    private String id;
    private String offerName;
    private BigDecimal offerPrice;
    private BigDecimal moneySaved;
    private String category;
    private List<String> foodItemsIDs = new ArrayList<String>();

    public OfferItem() {
    }

    public OfferItem(String offerName, BigDecimal offerPrice, FoodItem foodItem) {
        this.offerName = offerName;
        this.offerPrice = offerPrice;
        this.foodItem = foodItem;
        this.category = category;
        this.moneySaved = this.foodItem.price.subtract(this.offerPrice);
    }

    @Id
    public String getID() {
        return this.id;
    }

    public void setID(String id) {
        this.id = id;
    }
    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public BigDecimal getOfferPrice() {
        return offerPrice;
    }

    public void setOfferPrice(BigDecimal offerPrice) {
        this.offerPrice = offerPrice;
    }

    public BigDecimal getMoneySaved() {
        return moneySaved;
    }

    public void setMoneySaved(BigDecimal moneySaved) {
        this.moneySaved = moneySaved;
    }

    public List<String> getFoodItems() {
        return foodItemsIDs;
    }
    public void setFoodItemsIDs(List<String> foodItemsIDs)
    {
        this.foodItemsIDs = foodItemsIDs;
    }
}
