package org.productos.spring.java.productos2826502.repositories;

import java.util.List;

import org.productos.spring.java.productos2826502.entities.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    //La lista de un repositorio debe ser inmutable
    //La logica de un negocio no modificia la lista de un repository
    List<Product> productos = List.of(Product.builder().id(1L).nombre("silla reclinable").precio(280000.0).build(), 
    new Product(2L, "Pc Gamer", 5400000.0));

    //metodo(comportamiento) para consultar todos los productos del repositorio
    public List<Product> findAll(){
        return this.productos;
    }
}
