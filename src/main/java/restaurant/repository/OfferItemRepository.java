package restaurant.repository;

import org.springframework.stereotype.Repository;
import restaurant.models.OfferItem;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface OfferItemRepository extends JpaRepository<OfferItem, String> {

}