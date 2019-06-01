package repository.custom;

import models.FoodItem;

import java.util.List;

public interface FoodItemCustomRepository {

    List<FoodItem> findFoodItemByParams(String foodName, String description);

}
