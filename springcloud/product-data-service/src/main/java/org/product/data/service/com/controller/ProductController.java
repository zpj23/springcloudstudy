package org.product.data.service.com.controller;
import java.util.List;

import org.product.data.service.com.pojo.Product;
import org.product.data.service.com.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

 
@Controller
public class ProductController {
 
	@Autowired 
	ProductService productService;
	
    @RequestMapping("/products")
    public Object products(Model m) {
    	List<Product> ps = productService.listProducts();
        return ps;
    }
}