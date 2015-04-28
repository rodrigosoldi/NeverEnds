/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos.contasEJB;

import conta.ContaCorrente;
import javax.ejb.Stateful;
import javax.ejb.LocalBean;

/**
 *
 * @author RodrigoSoldi
 */
@Stateful
//@LocalBean
public class LoginManagerBean implements iLoginManager {

    private ContaCorrente contaCorrente;

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    @Override
    public void autenticar(String agencia, String conta) {
        
    }

    @Override
    public boolean isLogged() {
        return true;
    }
    
}
