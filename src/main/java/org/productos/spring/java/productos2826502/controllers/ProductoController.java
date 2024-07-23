package org.productos.spring.java.productos2826502.controllers;

import java.util.List;

import org.productos.spring.java.productos2826502.entities.Product;
import org.productos.spring.java.productos2826502.services.ProductServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/products")
public class ProductoController {

    //Inyectar el servicio
    private ProductServices service = new ProductServices(); 

    //Primer Endpoint
    //Es un metodo en un controlador
    @GetMapping("saludo")
    public String saludo(){
        return "Hola ... ";
    }

    //Segundo Endpoint
    //Get: obtener informacion sin alterarla
    //(Inmutable)
    @GetMapping("/{idproducto}")
    public String findProductById(@PathVariable String idproducto) {
        return "aqui se mostrara el producto cuyo ID es: " + idproducto;
    }
    @GetMapping
    public List<Product> findAllProducts(){
        //utilizo el servicio
        return service.findAllProducts();
    }
    

}
