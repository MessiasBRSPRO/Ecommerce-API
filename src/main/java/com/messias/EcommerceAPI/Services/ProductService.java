package com.messias.EcommerceAPI.Services;

import com.messias.EcommerceAPI.DTOs.DTOProduct;
import com.messias.EcommerceAPI.Entities.Product;
import com.messias.EcommerceAPI.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void insertProduct(DTOProduct dtoProduct){
        Product product = new Product(dtoProduct);
        productRepository.save(product);
    }
}
