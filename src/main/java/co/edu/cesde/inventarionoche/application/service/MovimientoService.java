package co.edu.cesde.inventarionoche.application.service;

import co.edu.cesde.inventarionoche.domain.model.Movimiento;

import java.util.List;
import java.util.Optional;

public interface MovimientoService {

    void save(Movimiento moviemiento);

    List<Movimiento> findAll();

    Optional<Movimiento> findById(Long id);

    void delete(Long id);

    void update(Movimiento movimiento);
}
