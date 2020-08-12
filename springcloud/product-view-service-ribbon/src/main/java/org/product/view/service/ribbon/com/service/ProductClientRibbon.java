package org.product.view.service.ribbon.com.service;

import java.util.List;

import org.product.view.service.ribbon.com.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ProductClientRibbon {
	@Autowired
    RestTemplate restTemplate;
 
    public List<Product> listProdcuts() {
    	List<Product> list=restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/products",List.class);
        return list;
    }
}
