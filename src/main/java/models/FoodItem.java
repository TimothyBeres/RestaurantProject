package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FoodItems")
public class FoodItem {
    private String id;
    @Id
    public String getID()
    {
        return this.id;
    }
    public void setID(String id)
    {
        this.id = id;
    }
}
