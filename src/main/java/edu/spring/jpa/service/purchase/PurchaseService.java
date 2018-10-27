package edu.spring.jpa.service.purchase;

import edu.spring.jpa.model.Purchase;
import edu.spring.jpa.repository.purchase.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PurchaseService {

    private PurchaseRepository purchaseRepository;

    @Autowired
    public PurchaseService(final PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    public Purchase save(final Purchase purchase) {
        return purchaseRepository.save(purchase);
    }

    @Transactional
    public List<Purchase> getAllWithItems(){
        return purchaseRepository.findAllWithItemsBy();
    }

    @Transactional
    public List<Purchase> getAllWithoutItems(){
        return purchaseRepository.findAllWithoutItemsBy();
    }
}
