package co.edu.cesde.inventarionoche.application.service;

import co.edu.cesde.inventarionoche.domain.model.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {

    void save(Producto producto);

    List<Producto> findAll();

    Optional<Producto> findById( Long id);

    void delete (Long id);

    void update(Producto producto);
}
