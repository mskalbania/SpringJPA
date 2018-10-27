package edu.spring.jpa.repository.purchase;

import edu.spring.jpa.model.Purchase;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

    @EntityGraph(value = "purchaseWithItems", type = EntityGraph.EntityGraphType.FETCH)
    List<Purchase> findAllWithItemsBy();

    @EntityGraph(value = "purchaseWithoutItems", type = EntityGraph.EntityGraphType.FETCH)
    List<Purchase> findAllWithoutItemsBy();
}
