/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos.transacaoEJB;

import conta.ContaCorrente;
import javax.ejb.Stateless;
import transacao.Transferencia;

/**
 *
 * @author RodrigoSoldi
 */
@Stateless
public class DebitoAutomaticoBean implements iDebitoAutomatico {

    @Override
    public boolean criarDebitoAutomatico(ContaCorrente contaCorrente, double valor) {
        Transferencia transferencia =  new Transferencia();
        
        return true;
    }

    
}
