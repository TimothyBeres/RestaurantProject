package restaurant.repository;

import org.springframework.stereotype.Repository;
import restaurant.models.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import restaurant.repository.custom.FoodItemCustomRepository;

import java.util.List;

@Repository
public interface FoodItemRepository extends JpaRepository<FoodItem, String>, FoodItemCustomRepository {


}
