package co.edu.cesde.inventarionoche.infrastructure.repository;

import co.edu.cesde.inventarionoche.domain.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
