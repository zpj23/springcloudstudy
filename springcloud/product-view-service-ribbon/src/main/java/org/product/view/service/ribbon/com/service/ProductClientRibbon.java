package org.product.view.service.ribbon.com.service;

import java.util.List;

import org.product.view.service.ribbon.com.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ProductClientRibbon {
	@Autowired
    RestTemplate restTemplate;//优雅的http请求方式RestTemplate
 
    public List<Product> listProdcuts() {
    	//以别名调用的话，必须要在resttemplate加@LoadBalanced
    	List<Product> list=restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/products",List.class);
        return list;
    }
}
