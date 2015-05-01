/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos.transacaoEJB;

import conta.ContaCorrente;
import java.util.Calendar;
import javax.ejb.Remote;

/**
 *
 * @author RodrigoSoldi
 */

@Remote
public interface iDebitoAutomatico {
    public boolean criarDebitoAutomatico(ContaCorrente contaCorrente, float valor, Calendar data);
}
