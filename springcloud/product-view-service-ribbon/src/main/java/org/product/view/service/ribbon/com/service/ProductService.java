package org.product.view.service.ribbon.com.service;

import java.util.List;

import org.product.view.service.ribbon.com.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {
	@Autowired 
	ProductClientRibbon productClientRibbon;
    public List<Product> listProducts(){
        return productClientRibbon.listProdcuts();
 
    }
}
