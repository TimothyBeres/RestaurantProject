package models;

import helpers.HelperClass;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
public class OfferItem {

    @Id private String id;
    private String offerName;
    private double offerPrice;
    private double moneySaved;
    @ManyToMany
    private List<FoodItem> foodItems;

    public OfferItem() {
    }

    public OfferItem(String offerName, double offerPrice, List<FoodItem> foodItems) {
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

    public List<FoodItem> getFoodItemIDs() {
        return foodItems;
    }
    public void setFoodItemsIDs(List<String> FoodItem)
    {
        this.foodItems = foodItems;
    }
}
