package org.example.sqch8ex1.controllers;

import org.example.sqch8ex1.model.Product;
import org.example.sqch8ex1.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductsController {

    private final ProductService service;

    public ProductsController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/products")
    public String viewProducts(Model model) {
        var products = service.findAll();
        model.addAttribute("products", products);

        return "products.html";
    }

    @PostMapping(path = "/products")
    public String addProducts(@RequestParam String name, @RequestParam double price, Model model) { // Product 자체로 받을 수 있음
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);

        service.addProduct(product);

        var products = service.findAll();
        model.addAttribute("products", products);

        return "products.html";
    }
}
