package restaurant.repository;

import org.springframework.stereotype.Repository;
import restaurant.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {
    //List<Order> findByCustomerIDContainingIgnoreCase(String category);

}