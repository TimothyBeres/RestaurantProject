package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "OfferItems")
public class OfferItem {

    private String id;
    private String offerName;
    private BigDecimal offerPrice;
    private BigDecimal moneySaved;
    @OneToOne
    private FoodItem foodItem;

    public OfferItem() {
    }

    public OfferItem(String offerName, BigDecimal offerPrice, FoodItem foodItem) {
        this.offerName = offerName;
        this.offerPrice = offerPrice;
        this.foodItem = foodItem;
        this.moneySaved = this.foodItem.price.subtract(this.offerPrice);
    }

    @Id
    public String getID() {
        return id;
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

    public FoodItem getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(FoodItem foodItem) {
        this.foodItem = foodItem;
    }
}
