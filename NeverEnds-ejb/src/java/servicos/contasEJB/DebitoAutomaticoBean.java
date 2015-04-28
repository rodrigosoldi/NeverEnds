/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos.contasEJB;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author RodrigoSoldi
 */
@Stateless
@LocalBean
public class DebitoAutomaticoBean implements iDebitoAutomatico {

    @Override
    public boolean criarDebitoAutomatico() {
        System.out.println("Criou um debito automatico!!!");
        return true;
    }

    
}
