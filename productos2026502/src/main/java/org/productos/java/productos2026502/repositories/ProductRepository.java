package org.productos.java.productos2026502.repositories;

import java.util.List;

import org.productos.java.productos2026502.entities.Product;
import org.springframework.stereotype.Repository;

@Repository

public class ProductRepository {
    List<Product> productos = List.of(
        Product.builder()
        .id(3232L)
        .nombre("mouse")
        .precio(12123.9)
        .build()
        ,
        new Product(2L, "escritorio", 110.2)



    );

    //metodo para consultar (comportamientos) todos
    //los productos del repository

    public List<Product> FindAll(){
        return this.productos;
    }
    

}
