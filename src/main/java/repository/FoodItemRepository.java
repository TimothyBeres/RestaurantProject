package repository;

import models.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import repository.custom.FoodItemCustomRepository;

import java.util.List;

public interface FoodItemRepository extends JpaRepository<FoodItem, String>, FoodItemCustomRepository {
    List<FoodItem> findByCategoryContainingIgnoreCase(String category);

}
