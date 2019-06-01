package models;

import helpers.HelperClass;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "OfferItems")
public class OfferItem {

    @Id private String id;
    private String offerName;
    private double offerPrice;
    private double moneySaved;
    @ElementCollection
    private List<String> foodItems;

    public OfferItem() {
    }

    public OfferItem(String offerName, double offerPrice, List<String> foodItems) {
        this.offerName = offerName;
        this.offerPrice = offerPrice;
        this.foodItems = foodItems;
        this.moneySaved = HelperClass.calculateSavedMoney(offerPrice, foodItems);
    }

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

    public double getOfferPrice() {
        return offerPrice;
    }

    public void setOfferPrice(double offerPrice) {
        this.offerPrice = offerPrice;
    }

    public double getMoneySaved() {
        return moneySaved;
    }

    public void setMoneySaved(double moneySaved) {
        this.moneySaved = moneySaved;
    }

    public List<String> getFoodItemIDs() {
        return foodItems;
    }
    public void setFoodItemsIDs(List<String> foodItems)
    {
        this.foodItems = foodItems;
    }
}
