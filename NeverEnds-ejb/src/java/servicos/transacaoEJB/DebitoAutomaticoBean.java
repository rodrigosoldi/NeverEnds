/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos.transacaoEJB;

import javax.ejb.Stateless;

/**
 *
 * @author RodrigoSoldi
 */
@Stateless
public class DebitoAutomaticoBean implements iDebitoAutomatico {

    @Override
    public boolean criarDebitoAutomatico() {
        return true;
    }

    
}
