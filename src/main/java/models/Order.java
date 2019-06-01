package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "Orders")
public class Order {

    private String id;
    private String clientName;
    private String offerId;
    private BigDecimal offerPrice;


    @Id
    public String getID() {
        return this.id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getClientName() {
        return this.clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getOfferId() {
        return this.offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public BigDecimal getOfferPrice() {
        return this.offerPrice;
    }

    public void setOfferPrice(BigDecimal offerPrice) {
        this.offerPrice = offerPrice;
    }
}
