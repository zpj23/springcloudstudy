package org.product.view.service.feign.com.service;

import java.util.List;

import org.product.view.service.feign.com.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "PRODUCT-DATA-SERVICE")
public interface ProductClientFeign {
	@GetMapping("/products")
    public List<Product> listProdcuts();
}
