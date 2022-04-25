package ch.fhnw.acrm.data.repository;

import ch.fhnw.acrm.data.domain.Order_Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Order_ItemRepository extends JpaRepository<Order_Item, Long> {
}