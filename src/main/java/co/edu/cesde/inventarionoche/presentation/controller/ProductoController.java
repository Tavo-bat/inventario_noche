package co.edu.cesde.inventarionoche.presentation.controller;

import co.edu.cesde.inventarionoche.application.service.ProductoService;
import co.edu.cesde.inventarionoche.domain.model.Producto;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService){
        this.productoService = productoService;
    }

    @GetMapping
    public List<Producto> findAll() {
        return productoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Producto> findById(@PathVariable Long id) {
        return productoService.findById(id);
    }

    @PostMapping
    public void save(@RequestBody Producto producto) {
        productoService.save(producto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        productoService.delete(id);
    }

    @PutMapping
    public void update(@RequestBody Producto producto) {
        productoService.update(producto);
    }
}
