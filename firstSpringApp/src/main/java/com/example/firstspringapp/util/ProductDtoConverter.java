package com.example.firstspringapp.util;

import com.example.firstspringapp.dto.ProductDto;
import com.example.firstspringapp.entity.Product;
import org.springframework.stereotype.Component;

@Component  //bean yaratmaq ucun
public class ProductDtoConverter {
  public ProductDto converter (Product product){
  ProductDto productDto=ProductDto.builder()
  .name(product.getName())
  .price(product.getPrice())
  .build();
  return productDto;
    }

}
