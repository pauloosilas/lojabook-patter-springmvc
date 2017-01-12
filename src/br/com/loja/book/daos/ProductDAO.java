package br.com.loja.book.daos;


import javax.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import br.com.loja.book.models.Product;

import javax.persistence.PersistenceContext;
/**
 *
 * @author paulo
 */
@Repository
public class ProductDAO {
    
    @PersistenceContext
    private EntityManager manager;
    
    public void save(Product product){
        manager.persist(product);
    }
}