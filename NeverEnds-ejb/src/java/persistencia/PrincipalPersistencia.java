/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import conta.Cartao;
import conta.ContaCorrente;
import conta.ContaPoupanca;
import entidade.Cliente;

/**
 *
 * @author RodrigoSoldi
 */
public class PrincipalPersistencia {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente();
        Cliente cliente4 = new Cliente();
        
        ContaCorrente contaCorrente1 = new ContaCorrente();
        ContaCorrente contaCorrente2 = new ContaCorrente();
        ContaCorrente contaCorrente3 = new ContaCorrente();
        ContaCorrente contaCorrente4 = new ContaCorrente();
        
        ContaPoupanca contaPoupanca1 = new ContaPoupanca();
        ContaPoupanca contaPoupanca2 = new ContaPoupanca();
        ContaPoupanca contaPoupanca3 = new ContaPoupanca();
        ContaPoupanca contaPoupanca4 = new ContaPoupanca();
        
        Cartao cartao1 = new Cartao();
        Cartao cartao2 = new Cartao();
        Cartao cartao3 = new Cartao();
        Cartao cartao4 = new Cartao();
        
        contaCorrente1.setCliente(cliente1);
        contaCorrente2.setCliente(cliente2);
        contaCorrente3.setCliente(cliente3);
        contaCorrente4.setCliente(cliente4);
        
        contaCorrente1.addCartao(cartao1);
        contaCorrente2.addCartao(cartao2);
        contaCorrente3.addCartao(cartao3);
        contaCorrente4.addCartao(cartao4);
        
        contaCorrente1.setContaPoupanca(contaPoupanca1);
        contaCorrente2.setContaPoupanca(contaPoupanca2);
        contaCorrente3.setContaPoupanca(contaPoupanca3);
        contaCorrente4.setContaPoupanca(contaPoupanca4);
        
        contaPoupanca1.setContaCorrente(contaCorrente1);
        contaPoupanca2.setContaCorrente(contaCorrente2);
        contaPoupanca3.setContaCorrente(contaCorrente3);
        contaPoupanca4.setContaCorrente(contaCorrente4);
        
        iPersistencia persistencia = new PersistenciaImpl();
        
        persistencia.save(cliente1);
        persistencia.save(cliente2);
        persistencia.save(cliente3);
        persistencia.save(cliente4);
        persistencia.save(contaCorrente1);
        persistencia.save(contaCorrente2);
        persistencia.save(contaCorrente3);
        persistencia.save(contaCorrente4);
        
    }
}
