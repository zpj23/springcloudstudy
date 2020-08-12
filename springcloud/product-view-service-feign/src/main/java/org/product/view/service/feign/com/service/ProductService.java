package org.product.view.service.feign.com.service;

import java.util.List;

import org.product.view.service.feign.com.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {
	@Autowired 
	ProductClientFeign productClientFeign;
    public List<Product> listProducts(){
        return productClientFeign.listProdcuts();
 
    }
}
