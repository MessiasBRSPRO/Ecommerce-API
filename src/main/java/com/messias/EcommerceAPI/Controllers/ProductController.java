package com.messias.EcommerceAPI.Controllers;

import com.messias.EcommerceAPI.DTOs.DTOProduct;
import com.messias.EcommerceAPI.Entities.Product;
import com.messias.EcommerceAPI.Repositories.ProductRepository;
import com.messias.EcommerceAPI.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/register-product")
    public ResponseEntity<Product> registerProductEndpoint(@RequestBody DTOProduct dtoProduct){
        productService.insertProduct(dtoProduct);
        return ResponseEntity.ok().build();
    }
}
