package Services;


import models.FoodItem;
import org.springframework.beans.factory.annotation.Autowired;
import repository.FoodItemRepository;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class MenuService {
    @PersistenceContext
    private EntityManager em;
    @Autowired
    private FoodItemRepository foodItemRepository;

    public List<FoodItem> getAll(String foodName, String description) {

        if (foodName != null && description != null) {
            return foodItemRepository.findFoodItemByParams(foodName, description);
        }
        return foodItemRepository.findAll();

        /*TypedQuery<FoodItem> query = em.createQuery("select f from FoodItems", FoodItem.class);
        return query.getResultList();*/
    }
}
