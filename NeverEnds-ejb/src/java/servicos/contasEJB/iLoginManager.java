/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos.contasEJB;

import javax.ejb.Remote;

/**
 *
 * @author RodrigoSoldi
 */

@Remote
public interface iLoginManager {
    public void autenticar(String agencia, String conta);
    public boolean isLogged();
}