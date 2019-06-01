package repository;

import com.sun.org.apache.xpath.internal.operations.Or;
import models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, String> {
    List<Order> findByCustomerIDContainingIgnoreCase(String category);

}