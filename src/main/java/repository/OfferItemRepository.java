package repository;

import com.sun.org.apache.xpath.internal.operations.Or;
import models.OfferItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferItemRepository extends JpaRepository<OfferItem, String> {

}