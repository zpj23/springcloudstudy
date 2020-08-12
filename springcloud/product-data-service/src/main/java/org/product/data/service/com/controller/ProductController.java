package org.product.data.service.com.controller;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.product.data.service.com.pojo.Product;
import org.product.data.service.com.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.hutool.json.JSONObject;

 
@RestController
public class ProductController {
 
	@Autowired 
	ProductService productService;
	
    @RequestMapping("/products")
    public Object products(Model m) {
    	List<Product> ps = productService.listProducts();
        return ps;
    }
}