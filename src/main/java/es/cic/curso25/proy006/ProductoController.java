package es.cic.curso25.proy006;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController //le digo "esto es mi API Rest"
@RequestMapping("/producto") //le digo "voy a exponer URLs que empiecen por /producto"
public class ProductoController {

    private int contador = 0;
    // C R U D
    // C
    @PostMapping
    public long create(@RequestBody long id) {
        return ++contador;
    }

    // R
    @GetMapping
    public List <Producto> get() {
    List<Producto> resultado = new ArrayList<>();
    Producto cremaSol = new Producto();
    cremaSol.setId(1);
    cremaSol.setMarca("Delial");
    cremaSol.setCantidad(5);
    cremaSol.setTipo("Objeto de verano");
    resultado.add(cremaSol);

    Producto barraPan = new Producto();
    barraPan.setId(2);
    barraPan.setMarca("Genérico");
    barraPan.setCantidad(15);
    barraPan.setTipo("Alimento básico");
    resultado.add(barraPan);

    Producto papelHigienico = new Producto();
    papelHigienico.setId(3);
    papelHigienico.setMarca("Scottex");
    papelHigienico.setCantidad(22);
    papelHigienico.setTipo("Higiene básica");
    resultado.add(papelHigienico);

    return resultado;
    }

    //No sé cómo hacerlo... la idea es que haya un método que, dependiendo del id que se le pase, dé un Producto diferente.
    //@GetMapping("/{id}")
    //public Telefono get(@PathVariable long id) {
        //if (id == 1) {
        //Producto cremaSol = new Producto();
        //cremaSol.setId(id);
        //cremaSol.setMarca("Delial");
        //cremaSol.setCantidad(5);
        //cremaSol.setTipo("Objeto de verano");
        //return cremaSol
        //}

        //if (id == 2) {
        //Producto barraPan = new Producto();
        //barraPan.setId(id);
        //barraPan.setMarca("Genérico");
        //barraPan.setCantidad(15);
        //barraPan.setTipo("Alimento básico");
        //return barraPan
        //}

        //if (id == 3) {
        //Producto papelHigienico = new Producto();
        //papelHigienico.setId(id);
        //papelHigienico.setMarca("Scottex");
        //papelHigienico.setCantidad(22);
        //papelHigienico.setTipo("Higiene básica");
        //return papelHigienico
        //}

        // else {
        //Producto productoVacio = new Producto();
        //productoVacio.setId(id);
        //productoVacio.setMarca("Vacía");
        //productoVacio.setCantidad(0);
        //productoVacio.setTipo("Nada");
        //return productoVacio

    
    // U
    @PutMapping
    public void update(@RequestBody Producto producto) {

    }

    // D
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Producto producto) {

    }

}
