package co.edu.cesde.inventarionoche.presentation.controller;


import co.edu.cesde.inventarionoche.application.service.MovimientoService;
import co.edu.cesde.inventarionoche.domain.model.Movimiento;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.List;

@RestController
@RequestMapping("/api/movimientos")
public class MovimientoController {

    private final MovimientoService movimientoService;

    public MovimientoController(MovimientoService movimientoService) {
        this.movimientoService = movimientoService;
    }


    @GetMapping
    public List<Movimiento> findAll() {
        return movimientoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Movimiento> findById(@PathVariable Long id) {
        return movimientoService.findById(id);
    }

    @PostMapping
    public void save(@RequestBody Movimiento movimiento) {
        movimientoService.save(movimiento);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        movimientoService.delete(id);
    }

    @PutMapping
    public void update(@RequestBody Movimiento movimiento) {
        movimientoService.update(movimiento);
    }

}
