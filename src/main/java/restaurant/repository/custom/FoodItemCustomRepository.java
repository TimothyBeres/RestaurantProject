package restaurant.repository.custom;

import restaurant.models.FoodItem;

import java.util.List;

public interface FoodItemCustomRepository {

    List<FoodItem> findFoodItemByParams(String foodName, String description);

}
