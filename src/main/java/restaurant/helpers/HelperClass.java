package restaurant.helpers;

import restaurant.models.FoodItem;
import java.util.List;

public class HelperClass {
    public static Double calculateSavedMoney(Double offerPrice, List<FoodItem> foodItems)
    {
        double sumPrices = 0;
        double savedMoney = 0;
        for(FoodItem foodItem: foodItems)
        {
            //logic
        }
        savedMoney = sumPrices - offerPrice;

        return savedMoney;
    }
    public static Double calculateOrderPrice(List<FoodItem> foodItems)
    {
        double sumPrices = 0;
        for(FoodItem foodItem: foodItems)
        {
            //logic
        }
        return sumPrices;
    }
}
