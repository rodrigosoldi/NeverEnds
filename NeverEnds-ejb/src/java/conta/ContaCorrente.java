/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

import entidade.Cliente;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import transacao.Transacao;
import transacao.Transferencia;

/**
 *
 * @author RodrigoSoldi
 */
@Entity
public class ContaCorrente implements Serializable {
    
    @OneToOne
    private Cliente cliente;
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String senha;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataCriacao;
    
    private String numConta;
    private String agencia;
    private float saldo;
    
    @OneToOne
    private ContaPoupanca contaPoupanca;
    
    @OneToMany(mappedBy = "contaCorrente", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Cartao> cartoes;
    
    @OneToMany(mappedBy = "contaCorrente", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Transacao> transacoes;

    public ContaCorrente() {
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Calendar getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Calendar dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public ContaPoupanca getContaPoupanca() {
        return contaPoupanca;
    }

    public void setContaPoupanca(ContaPoupanca contaPoupanca) {
        this.contaPoupanca = contaPoupanca;
    }

    public List<Cartao> getCartoes() {
        return cartoes;
    }

    public void setCartoes(List<Cartao> cartoes) {
        this.cartoes = cartoes;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(List<Transacao> transacoes) {
        this.transacoes = transacoes;
    }
    
    public void addCartao(Cartao cartao) {
        if(cartoes == null) {
            cartoes = new ArrayList();
        }
        cartoes.add(cartao);
        cartao.setContaCorrente(this);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContaCorrente)) {
            return false;
        }
        ContaCorrente other = (ContaCorrente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "conta.ContaCorrente[ id=" + id + " ]";
    }

    public void addTransacao(Transferencia transferencia) {
        if(this.transacoes == null)
            this.transacoes = new ArrayList<Transacao>();
        
        this.transacoes.add(transferencia);
        transferencia.setContaCorrente(this);
                
    }
    
}
