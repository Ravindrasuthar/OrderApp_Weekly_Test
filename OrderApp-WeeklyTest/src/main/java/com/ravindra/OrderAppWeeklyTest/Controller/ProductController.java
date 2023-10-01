package com.ravindra.OrderAppWeeklyTest.Controller;

import com.ravindra.OrderAppWeeklyTest.Model.ProductModel;
import com.ravindra.OrderAppWeeklyTest.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("add/product")
    public String AddProduct(@RequestBody ProductModel productModel)
    {
        return productService.AddProduct(productModel);
    }

    @GetMapping("get/all/products/by/category/{category}")
    public List<ProductModel> GetAllProductByCategory(@PathVariable String category)
    {
        return productService.GetAllProductByCategory(category);
    }

    @DeleteMapping("delete/product/by/id/{Id}")
    public String DeleteProductById(@PathVariable Integer Id)
    {
        return productService.DeleteProductById(Id);
    }
}
