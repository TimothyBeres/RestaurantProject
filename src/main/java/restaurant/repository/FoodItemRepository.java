package restaurant.repository;

import restaurant.models.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import restaurant.repository.custom.FoodItemCustomRepository;

import java.util.List;

public interface FoodItemRepository extends JpaRepository<FoodItem, String>, FoodItemCustomRepository {
    List<FoodItem> findByCategoryContainingIgnoreCase(String category);

}
