package com.example.firstspringapp.service;

import com.example.firstspringapp.dto.ProductDto;
import com.example.firstspringapp.dto.request.CreateProductRequest;
import com.example.firstspringapp.dto.request.UpdateProductRequest;
import com.example.firstspringapp.dto.response.ProductResponse;
import com.example.firstspringapp.entity.Product;
import com.example.firstspringapp.repository.ProductRepository;
import com.example.firstspringapp.service.inter.ProductServiceInter;
import com.example.firstspringapp.util.ProductDtoConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static ch.qos.logback.classic.spi.ThrowableProxyVO.build;
import static java.util.Arrays.stream;

@Service  //Containerde bean-lerin yaradilmasi
@RequiredArgsConstructor  //Autowired-in evezine
public class ProductService implements ProductServiceInter {


private final ProductRepository productRepository;
private final ProductDtoConverter productDtoConverter;



    @Override
      public void createProduct(CreateProductRequest createProductRequest) {
      Product result= Product.builder()
      .name(createProductRequest.getName())
      .price(createProductRequest.getPrice())
      .build();
      productRepository.save(result);
      }

    @Override
       public ProductResponse getAllProduct() {
       List<ProductDto> productDtoList=productRepository.findAll()
       .stream()
       .map(productDtoConverter::converter)
       .collect(Collectors.toList());
       return ProductResponse.builder()
       .productDtoList(productDtoList)
       .build();
       }

     @Override
        public void updateProduct(Integer id, UpdateProductRequest updateProductRequest) {
        Product product1=productRepository.findById((int)id);
        product1.setName(updateProductRequest.getName());
        product1.setPrice(updateProductRequest.getPrice());
        productRepository.save(product1);
       }

       @Override
       public void deleteProduct(Integer id) {
       Product product= productRepository.findById((int)id);
       productRepository.delete(product);
       }
}
