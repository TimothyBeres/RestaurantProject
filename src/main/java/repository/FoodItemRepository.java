package repository;

import models.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import repository.custom.FoodItemCustomRepository;

public interface FoodItemRepository extends JpaRepository<FoodItem, String>, FoodItemCustomRepository {


}
