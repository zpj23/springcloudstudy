package org.product.view.service.ribbon.com.controller;
import java.util.List;

import org.product.view.service.ribbon.com.pojo.Product;
import org.product.view.service.ribbon.com.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

 
@Controller
public class ProductController {
 
	@Autowired 
	ProductService productService;
	
    @RequestMapping("/products1")
    public Object products(Model m) {
    	List<Product> ps = productService.listProducts();
        m.addAttribute("ps", ps);
        return "products";
    }
}