/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta.persistencia;

import conta.ContaCorrente;


/**
 *
 * @author RodrigoSoldi
 */
public interface iContaPersistencia {
    ContaCorrente autenticarConta(String agencia, String conta);
}
