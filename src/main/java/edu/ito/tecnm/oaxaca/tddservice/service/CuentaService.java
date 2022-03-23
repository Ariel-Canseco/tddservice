
package edu.ito.tecnm.oaxaca.tddservice.service;

import edu.ito.tecnm.oaxaca.tddservice.model.CuentaModel;
import java.util.List;

/**
 *
 * @author Jester
 */

public interface CuentaService {

    public void createCuenta(CuentaModel cuenta);
    
    public List getCuentas();
    
    public CuentaModel getCuenta(String numeroCuenta);
    
    public void updateCuenta(CuentaModel cuentaModel, Integer idCuenta);
    
    public void deleteCuenta(Integer idCuenta);
}
