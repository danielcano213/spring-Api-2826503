package org.productos.java.productos2026502.services;

import java.util.List;

import org.productos.java.productos2026502.entities.Product;
import org.productos.java.productos2026502.repositories.ProductRepository;
import org.springframework.stereotype.Service;

@Service

public class ProductServices {

    //inyectar la dependencia
    //al repositorio
    private ProductRepository
    repository = new ProductRepository();

    public List<Product> findAllProducts(){
        return repository.FindAll();
    }

}
