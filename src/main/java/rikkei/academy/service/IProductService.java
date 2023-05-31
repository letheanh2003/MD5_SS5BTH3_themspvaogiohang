package rikkei.academy.service;

import org.springframework.stereotype.Repository;
import rikkei.academy.model.Product;

import java.util.Optional;

@Repository
public interface IProductService  {
    Iterable<Product> findAll();
    Optional<Product> findById(Long id);
}
