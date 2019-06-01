package restaurant.repository;

import restaurant.models.OfferItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferItemRepository extends JpaRepository<OfferItem, String> {

}