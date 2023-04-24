package com.example.firstspringapp.Controller;

import com.example.firstspringapp.dto.ProductDto;
import com.example.firstspringapp.dto.request.CreateProductRequest;
import com.example.firstspringapp.dto.request.UpdateProductRequest;
import com.example.firstspringapp.dto.response.ProductResponse;
import com.example.firstspringapp.entity.Product;
import com.example.firstspringapp.service.inter.ProductServiceInter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController  //Web-e sorgu gonderir
@RequestMapping(value="/example" ,method=RequestMethod.POST)  //Url-i yazmaq ucun
@RequiredArgsConstructor  //automatic inject ucun
public class ProductController {
private final ProductServiceInter productServiceInter;

        @PostMapping("/register")
        @ResponseStatus(HttpStatus.ACCEPTED)
        private void create(@RequestBody CreateProductRequest createProductRequest){
        productServiceInter.createProduct(createProductRequest);
        }

        @GetMapping("/products")
        @ResponseStatus(HttpStatus.OK)
        public ProductResponse  readAllproducts(){
        return productServiceInter.getAllProduct();

        }

        @PatchMapping("/update/{id}")
        @ResponseStatus(HttpStatus.ACCEPTED)
        public void update(@PathVariable Integer id, @RequestBody UpdateProductRequest updateProductRequest){
        productServiceInter.updateProduct(id, updateProductRequest);
        }

        @DeleteMapping("/delete/{id}")
        @ResponseStatus(HttpStatus.ACCEPTED)
        public void delete(@PathVariable Integer id){
        productServiceInter.deleteProduct(id);
        }
}
