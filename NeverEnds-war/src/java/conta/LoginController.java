/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.servlet.http.HttpServletRequest;
import servicos.contasEJB.LoginManagerBean;
import servicos.contasEJB.iLoginManager;

/**
 *
 * @author RodrigoSoldi
 */
@ManagedBean
@RequestScoped
public class LoginController {
    
    @EJB
    private LoginManagerBean loginManager;
    
    private HttpServletRequest request;

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }
    
    public void execute() {
        String agencia = request.getParameter("agencia");
        String conta = request.getParameter("conta");
//        this.loginManager = new LoginManagerBean();
        loginManager.autenticar(agencia, conta);
    }
}
