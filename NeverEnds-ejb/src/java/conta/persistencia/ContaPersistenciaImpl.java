/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta.persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author RodrigoSoldi
 */
public class ContaPersistenciaImpl implements iContaPersistencia{

    @Override
    public boolean autenticarConta(String agencia, String conta) {
        
//        EntityManager manager;
//        manager = new PersistenceImpl().getManager();
//        Query query = manager.createQuery("SELECT conta.id ,conta.agencia, conta.numConta FROM ContaCorrente AS conta WHERE conta.agencia = :ag AND conta.numConta = :numC", ContaCorrente.class);        
//        query.setParameter("ag", agencia);
//        query.setParameter("numC", conta);
//        query.setMaxResults(1);
//        Object[] a = (Object[])query.getSingleResult();
//        return a;
        
        
        
        return false;
    }
}
