/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos.transacaoEJB;

import conta.ContaCorrente;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.ejb.Schedule;
import javax.ejb.Stateless;
import persistencia.PersistenciaImpl;
import persistencia.iPersistencia;
import transacao.Transacao;
import transacao.Transferencia;

/**
 *
 * @author RodrigoSoldi
 */
@Stateless
public class DebitoAutomaticoBean implements iDebitoAutomatico {

    @Override
    public boolean criarDebitoAutomatico(ContaCorrente contaCorrente, float valor, Calendar data) {
        Transferencia transferencia =  new Transferencia();
        transferencia.setValor(valor);
        transferencia.setDataTransacao(data);
        contaCorrente.addTransacao(transferencia);
        iPersistencia persitencia = new PersistenciaImpl();
        
        persitencia.save(transferencia);
        return true;
    }

    @Schedule(second="*/59", minute="*/59", hour="*/23", persistent=false)
    public void debita() {
        iPersistencia p = new PersistenciaImpl();
        List<Transacao> transacoes = (List)p.list(Transacao.class);
        for (Transacao t : transacoes) {
            t.setId(null);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd");
            String hoje = dateFormat.format(new GregorianCalendar().getTime());
            String data = dateFormat.format(t.getDataTransacao().getTime());
            if (hoje.equals(data)) {
                t.debitar();
                p.save(t);
            }
        }
    }
    
}
