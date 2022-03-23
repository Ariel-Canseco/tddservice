package edu.ito.tecnm.oaxaca.tddservice.implement_service;

import edu.ito.tecnm.oaxaca.tddservice.model.CuentaModel;
import edu.ito.tecnm.oaxaca.tddservice.repository.CuentaRepository;
import edu.ito.tecnm.oaxaca.tddservice.service.CuentaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jester
 */
@Service
public class CuentaServiceImplement implements CuentaService{

    @Autowired
    private CuentaRepository cuentaRepository;
    
    @Override
    public void createCuenta(CuentaModel cuenta) {
        cuentaRepository.save(cuenta);
    }

    @Override
    public List getCuentas() {
        return cuentaRepository.findAll();
    }

    @Override
    public CuentaModel getCuenta(String numeroCuenta) {
        return cuentaRepository.findByNumeroCuenta(numeroCuenta);
    }

    @Override
    public void updateCuenta(CuentaModel cuentaModel, Integer idCuenta) {
        cuentaModel.setIdCuenta(idCuenta);
        cuentaRepository.save(cuentaModel);
    }

    @Override
    public void deleteCuenta(Integer idCuenta) {
        cuentaRepository.deleteById(idCuenta);
    }
    
}
