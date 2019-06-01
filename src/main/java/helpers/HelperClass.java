package helpers;

import models.FoodItem;
import java.util.List;

public class HelperClass {
    public static Double calculateSavedMoney(Double offerPrice, List<String> foodItems)
    {
        double sumPrices = 0;
        double savedMoney = 0;
        for(String foodItem: foodItems)
        {
            //logic
        }
        savedMoney = sumPrices - offerPrice;

        return savedMoney;
    }
    public static Double calculateOrderPrice(List<String> foodItems)
    {
        double sumPrices = 0;
        for(String foodItem: foodItems)
        {
            //logic
        }
        return sumPrices;
    }
}
