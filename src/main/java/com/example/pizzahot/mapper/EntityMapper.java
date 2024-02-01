package com.example.pizzahot.mapper;


import com.example.pizzahot.dto.CartDto;
import com.example.pizzahot.dto.CustomerDto;
import com.example.pizzahot.dto.ProductDto;
import com.example.pizzahot.entity.Cart;
import com.example.pizzahot.entity.Customer;
import com.example.pizzahot.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EntityMapper {

    EntityMapper INSTANCE = Mappers.getMapper(EntityMapper.class);

    @Mapping(target = "customerId", source = "customer.customerId")
    CartDto cartToCartDto(Cart cart);

    @Mapping(target = "id", source = "product.id")
    @Mapping(target = "imagePath", source = "product.imagePath")
    ProductDto productToProductDto(Product product);

    @Mapping(target = "id", source = "customer.id")
    @Mapping(target = "cartId", source = "customer.cartId")
    CustomerDto customerToCustomerDto(Customer customer);


}


