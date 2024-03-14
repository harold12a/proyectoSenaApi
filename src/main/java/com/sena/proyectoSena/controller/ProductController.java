package com.sena.proyectoSena.controller;

import com.sena.proyectoSena.entity.Local;
import com.sena.proyectoSena.entity.Product;
import com.sena.proyectoSena.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/Product")

public class ProductController {

    @Autowired
    ProductService productService;


    @GetMapping("/findAll")
    public List<Product> findAll()

    {
        return productService.findAll();
    }

}
