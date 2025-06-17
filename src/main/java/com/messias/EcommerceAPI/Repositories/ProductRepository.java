package com.messias.EcommerceAPI.Repositories;

import com.messias.EcommerceAPI.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // não é necessário, apenas para fins de explicação detalhada
public interface ProductRepository extends JpaRepository<Product, Long> {
}
