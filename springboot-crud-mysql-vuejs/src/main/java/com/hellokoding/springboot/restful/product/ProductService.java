package com.hellokoding.springboot.restful.product;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRespository productRespository;

    public ProductService(ProductRespository productRespository) {
        this.productRespository = productRespository;
    }

    public List<Product> findAll() {
        return productRespository.findAll();
    }

    public Optional<Product> findById(Long id) {
        return productRespository.findById(id);
    }

    public Product save(Product stock) {
        return productRespository.save(stock);
    }

    public void deleteById(Long id) {
        productRespository.deleteById(id);
    }
}
