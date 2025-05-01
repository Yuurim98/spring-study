package org.example.sqch8ex1.services;

import java.util.ArrayList;
import java.util.List;
import org.example.sqch8ex1.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> findAll() {
        return products;
    }

}
