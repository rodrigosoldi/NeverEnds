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
import java.util.GregorianCalendar;

/**
 *
 * @author RodrigoSoldi
 */
public class PrincipalPersistencia {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente();
        cliente1.setNome("kaique");
        cliente1.setCpf("111111111");
        
        Cliente cliente2 = new Cliente();
        cliente2.setNome("rodrigo");
        cliente2.setCpf("22222222");
        
        Cliente cliente3 = new Cliente();
        cliente3.setNome("emannuel");
        cliente3.setCpf("33333333");
        
        ContaCorrente contaCorrente1 = new ContaCorrente();
        contaCorrente1.setAgencia("1234");
        contaCorrente1.setNumConta("1234");
        contaCorrente1.setSenha("1234");
        contaCorrente1.setSaldo(100);
        
        ContaCorrente contaCorrente2 = new ContaCorrente();
        contaCorrente2.setAgencia("5678");
        contaCorrente2.setNumConta("5678");
        contaCorrente2.setSenha("5678");
        contaCorrente2.setSaldo(100);
        
        ContaCorrente contaCorrente3 = new ContaCorrente();
        contaCorrente3.setAgencia("9101");
        contaCorrente3.setNumConta("9101");
        contaCorrente3.setSenha("9101");
        contaCorrente3.setSaldo(100);
       
        ContaPoupanca contaPoupanca1 = new ContaPoupanca();
        contaPoupanca1.setSaldo(100);
        
        ContaPoupanca contaPoupanca2 = new ContaPoupanca();
        contaPoupanca2.setSaldo(200);
        
        ContaPoupanca contaPoupanca3 = new ContaPoupanca();
        contaPoupanca3.setSaldo(300);
        
        Cartao cartao1 = new Cartao();
        cartao1.setBandeira("visa");
        cartao1.setCodigoSeguranca("649");
        cartao1.setNomeCliente("kaique");
        cartao1.setTipo("credito");
        cartao1.setValidade(new GregorianCalendar());
        
        Cartao cartao2 = new Cartao();
        cartao2.setBandeira("mastercard");
        cartao2.setCodigoSeguranca("764");
        cartao2.setNomeCliente("rodrigo");
        cartao2.setTipo("débito");
        cartao2.setValidade(new GregorianCalendar());
        
        Cartao cartao3 = new Cartao();
        cartao3.setBandeira("visa");
        cartao3.setCodigoSeguranca("890");
        cartao3.setNomeCliente("emannuel");
        cartao3.setTipo("credito");
        cartao3.setValidade(new GregorianCalendar());
        
        cartao1.setContaCorrente(contaCorrente1);
        cartao2.setContaCorrente(contaCorrente2);
        cartao3.setContaCorrente(contaCorrente3);
        
        contaCorrente1.setCliente(cliente1);
        contaCorrente2.setCliente(cliente2);
        contaCorrente3.setCliente(cliente3);
        
        contaCorrente1.addCartao(cartao1);
        contaCorrente2.addCartao(cartao2);
        contaCorrente3.addCartao(cartao3);
        
        contaCorrente1.setContaPoupanca(contaPoupanca1);
        contaCorrente2.setContaPoupanca(contaPoupanca2);
        contaCorrente3.setContaPoupanca(contaPoupanca3);
        
        contaPoupanca1.setContaCorrente(contaCorrente1);
        contaPoupanca2.setContaCorrente(contaCorrente2);
        contaPoupanca3.setContaCorrente(contaCorrente3);
    }
}
