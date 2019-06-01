package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "OfferItems")
public class OfferItem {

    private String id;
    private String offerName;
    private BigDecimal offerPrice;

    @Id
    public String getID() {
        return this.id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getOfferName(){
        return this.offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public BigDecimal getOfferPrice(){
        return this.offerPrice;
    }

    public void setOfferPrice(BigDecimal offerPrice) {
        this.offerPrice = offerPrice;
    }
}
