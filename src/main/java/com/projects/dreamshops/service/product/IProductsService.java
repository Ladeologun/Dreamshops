package com.projects.dreamshops.service.product;

import com.projects.dreamshops.model.Product;
import com.projects.dreamshops.request.AddProductRequest;
import com.projects.dreamshops.request.ProductUpdateRequest;

import java.util.List;

public interface IProductsService {
    Product addProduct(AddProductRequest product);
    Product getProductById(Long id);
    Product updateProduct(ProductUpdateRequest product, Long id);
    void deleteProduct(Long id);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String category, String name);
    Long countProductsByBrandAndName(String brand, String name);
}
