package services;

import entities.Supplier;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;


public class SupplierService {

    
    @PersistenceContext
    private EntityManager em;  

    public List<Supplier> getAll() {
        return em
                .createNamedQuery("Suplier.findAll", Supplier.class)
                .getResultList();
    }
    
    @Transactional
    public void insert(Supplier c){
        em.persist(c);
        em.flush(); 
    }
    
    
}
