/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta.persistencia;

import conta.ContaCorrente;
import javax.ejb.Local;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import persistencia.PersistenciaImpl;

/**
 *
 * @author RodrigoSoldi
 */
@Local
public class ContaPersistenciaImpl implements iContaPersistencia{
    
    @Override
    public boolean autenticarConta(String agencia, String conta) {
        
        EntityManager manager = new PersistenciaImpl().getManager();
        Query query = manager.createQuery("SELECT conta FROM ContaCorrente AS conta WHERE conta.agencia = :ag AND conta.numConta = :numC", ContaCorrente.class);        
        query.setParameter("ag", agencia);
        query.setParameter("numC", conta);
        query.setMaxResults(1);
        try{
            ContaCorrente contaCorrente = (ContaCorrente)query.getSingleResult();
            return contaCorrente != null;
        }catch(NoResultException e){
            return false;
        }
        
    }
}
