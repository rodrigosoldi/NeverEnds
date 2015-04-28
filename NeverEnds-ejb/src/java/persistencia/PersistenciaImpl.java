/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.ejb.Local;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author RodrigoSoldi
 */
@Local
public class PersistenciaImpl implements iPersistencia{
    
    private EntityManagerFactory factory;
    private EntityManager manager;
    private EntityTransaction transaction;
    
    public PersistenciaImpl() {
        this.factory = Persistence.createEntityManagerFactory("NeverEnds-ejbPU");
        manager = this.factory.createEntityManager();
    }
    
    @Override
    public Serializable get(Class classe, Long id) {
        try{
            transaction = manager.getTransaction();
            transaction.begin();
            return (Serializable)manager.getReference(classe, id);           
        }catch(PersistenceException e){
            transaction.rollback();
        }
        return null;
    }

    @Override
    public void save(Serializable object) {
        try{
            transaction = manager.getTransaction();
            transaction.begin();
            manager.persist(object);
            transaction.commit();
        }catch(PersistenceException e){
            transaction.rollback();
        }
    }

    @Override
    public void delete(Serializable object) {
        try{
            transaction = manager.getTransaction();
            transaction.begin();
            manager.remove(object);
            transaction.commit();
        }catch(PersistenceException e){
            transaction.rollback();
        }
    }

    @Override
    public void update(Serializable object) {
        try{
            transaction = manager.getTransaction();
            transaction.begin();
            manager.merge(object);
            transaction.commit();
        }catch(PersistenceException e){
            transaction.rollback();
        } 
   }

    @Override
    public List<Serializable> list(Class classe) {
        try{
            CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();            
            CriteriaQuery criteriaQuery = criteriaBuilder.createQuery(classe);
            Root objectos = criteriaQuery.from(classe);
            criteriaQuery.select(objectos);                        
            return manager.createQuery(criteriaQuery).getResultList();
        }catch(PersistenceException e){
        }
        return null;
    }

    @Override
    public EntityManager getManager() {
        if(factory == null){
            factory = Persistence.createEntityManagerFactory("NeverEnds-ejbPU");
            this.manager = factory.createEntityManager();
        }
        return this.manager;
    }
    
}
