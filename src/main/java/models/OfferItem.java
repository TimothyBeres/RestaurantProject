package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "OfferItems")
public class OfferItem {

    private String id;
    private String offerName;
    private BigDecimal offerPrice;

    ////Kas ühel offeril võib olla ainult üks foodItem või mitu? ONE TO MANY VÕI ONE TO ONE?
    @OneToMany
    private List<FoodItem> foodItems;

    @Id
    public String getID() {
        return this.id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getOfferName() {
        return this.offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public BigDecimal getOfferPrice() {
        return this.offerPrice;
    }

    public void setOfferPrice(BigDecimal offerPrice) {
        this.offerPrice = offerPrice;
    }

    public List<FoodItem> getFoodItems() {
        return this.foodItems;
    }

    public void setFoodItems(List<FoodItem> foodItems) {
        this.foodItems = foodItems;
    }
}
