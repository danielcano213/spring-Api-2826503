package org.productos.java.productos2026502.controllers;

import java.util.List;

import org.productos.java.productos2026502.entities.Product;
import org.productos.java.productos2026502.services.ProductServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

@RequestMapping("/api/products")
public class ProductController {

    //knyectar el servicio
    private ProductServices service =
    new ProductServices();

    //primer endpoint
    //endpoint: un metodo en un controlador

    @GetMapping("/saludo")
    public String saludo(){
        return "hola 2826502";
    }

        //segundo endpoint
        //get: obtener informacion sinn alterarla
        //(inmutable)
        @GetMapping("/{idproducto}")
        public String findProductById(@PathVariable String idproducto){
            return "aqui se mostrara el producto cuyo id es:" + idproducto;
        }


        @GetMapping
        public List<Product> findAllProducts(){
            return service.findAllProducts();
        }
}

