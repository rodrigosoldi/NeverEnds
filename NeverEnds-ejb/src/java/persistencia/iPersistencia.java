/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author RodrigoSoldi
 */
public interface iPersistencia {
    
    Serializable get(Class classe, Long id);
    void save(Serializable object);
    void delete(Serializable object);
    void update(Serializable object);
    List<Serializable> list(Class classe);
}
