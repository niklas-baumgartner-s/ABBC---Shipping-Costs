package ch.fhnw.acrm.data.repository;

import ch.fhnw.acrm.data.domain.Order_Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Order_ItemRepository extends JpaRepository<Order_Item, Long> {

    @Query("select count(o) from Order_Item o where o.order.id = ?1")
    long CountItem(Long id);

    @Query("select o.product.id from Order_Item o where o.order.id = ?1")
    List<Order_Item> findOrderItemByOrder(Long id);

    @Query("select o from Order_Item o where o.order.agent.id = ?1")
    List<Order_Item> findOrderItemByAgent(Long id);

}