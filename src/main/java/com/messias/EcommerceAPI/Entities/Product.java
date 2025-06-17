package com.messias.EcommerceAPI.Entities;

import com.messias.EcommerceAPI.DTOs.DTOProduct;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double price;

    private Integer qtdEstoque;

    public Product(DTOProduct dtoProduct){
        this.id = dtoProduct.id();
        this.name = dtoProduct.name();
        this.price = dtoProduct.price();
        this.qtdEstoque = dtoProduct.qtdEstoque();
    }
}
