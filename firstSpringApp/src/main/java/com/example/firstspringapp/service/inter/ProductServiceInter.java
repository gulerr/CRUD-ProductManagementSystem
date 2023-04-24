package com.example.firstspringapp.service.inter;

import com.example.firstspringapp.dto.ProductDto;
import com.example.firstspringapp.dto.request.CreateProductRequest;
import com.example.firstspringapp.dto.request.UpdateProductRequest;
import com.example.firstspringapp.dto.response.ProductResponse;
import com.example.firstspringapp.entity.Product;

import java.util.List;

    public interface ProductServiceInter {
    void createProduct (CreateProductRequest createProductRequest);
    ProductResponse getAllProduct ();
    void updateProduct (Integer id, UpdateProductRequest updateProductRequest);
    void deleteProduct(Integer id);
}
