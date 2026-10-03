package co.edu.cesde.inventarionoche.application.service.Impl;

import co.edu.cesde.inventarionoche.application.service.MovimientoService;
import co.edu.cesde.inventarionoche.application.service.ProductoService;
import co.edu.cesde.inventarionoche.domain.model.Movimiento;
import co.edu.cesde.inventarionoche.infrastructure.repository.MovimientoRepository;
import co.edu.cesde.inventarionoche.infrastructure.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimientoServiceImpl implements MovimientoService {

    private final MovimientoRepository movimientoRepository;

    public MovimientoServiceImpl(MovimientoRepository movimientoRepository){
        this.movimientoRepository = movimientoRepository;
    }

    @Override
    public void save(Movimiento moviemiento) {
    movimientoRepository.save(moviemiento);
    }

    @Override
    public List<Movimiento> findAll() {
        return movimientoRepository.findAll();
    }

    @Override
    public Optional<Movimiento> findById(Long id) {
        return movimientoRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        Movimiento movimiento = movimientoRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Movimiento no encontrado"));

        movimientoRepository.delete(movimiento);

    }

    @Override
    public void update(Movimiento movimiento) {
        Movimiento movimientoActual = movimientoRepository
                .findById(movimiento.getId())
                .orElseThrow(() ->
                        new RuntimeException("Movimiento no encontrado"));

        movimientoActual.setCantidad(movimiento.getCantidad());
        movimientoActual.setTipo(movimiento.getTipo());

        movimientoRepository.save(movimientoActual);

    }
}
