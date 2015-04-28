/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import conta.ContaCorrente;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author RodrigoSoldi
 */
@Entity
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String cpf;
    
    @OneToMany(mappedBy = "cliente",cascade = CascadeType.ALL)
    private List<Endereco> enderecos;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar nascimento;
    
    @OneToOne(mappedBy = "cliente", cascade = CascadeType.ALL)
    private ContaCorrente contaCorrente;
    
    public void addEndereco(Endereco endereco){
        if(this.enderecos == null)
            this.enderecos = new ArrayList<Endereco>();
        
        this.enderecos.add(endereco);
        endereco.setCliente(this);
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.Cliente[ id=" + id + " ]";
    }
    
}
