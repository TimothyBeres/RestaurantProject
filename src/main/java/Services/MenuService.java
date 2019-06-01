package Services;


import models.FoodItem;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class MenuService {
    @PersistenceContext
    private EntityManager em;

    public List<FoodItem> getAll(){
        TypedQuery<FoodItem> query = em.createQuery("select f from FoodItems", FoodItem.class);
        return query.getResultList();

    }
}
