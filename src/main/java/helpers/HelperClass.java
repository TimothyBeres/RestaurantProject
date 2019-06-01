package helpers;

import models.FoodItem;
import java.util.List;

public class HelperClass {
    public static Double calculateSavedMoney(Double offerPrice, List<FoodItem> foodItems)
    {
        double sumPrices = 0;
        double savedMoney = 0;
        for(FoodItem foodItem: foodItems)
        {
            sumPrices += foodItem.price;
        }
        savedMoney = sumPrices - offerPrice;

        return savedMoney;
    }
}
