package edu.ito.tecnm.oaxaca.tddservice.repository;

import edu.ito.tecnm.oaxaca.tddservice.model.CuentaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jester
 */
@Repository
public interface CuentaRepository extends JpaRepository<CuentaModel, Integer>{
    public CuentaModel findByNumeroCuenta(String numeroCuenta);
}
