package com.ravindra.OrderAppWeeklyTest.Service;

import com.ravindra.OrderAppWeeklyTest.Model.OrderModel;
import com.ravindra.OrderAppWeeklyTest.Model.ProductModel;
import com.ravindra.OrderAppWeeklyTest.Repo.IOrderRepo;
import com.ravindra.OrderAppWeeklyTest.Repo.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    IProductRepo productRepo;

    @Autowired
    IOrderRepo orderRepo;

    public String AddProduct(ProductModel productModel) {
        productRepo.save(productModel);
        return "Product Added";
    }

    public List<ProductModel> GetAllProductByCategory(String category) {
        return productRepo.GetAllProductByCategory(category);
    }

    public String DeleteProductById(Integer id) {

        ProductModel productModel = productRepo.findById(id).get();
        OrderModel orderModel = orderRepo.findByproductModel(productModel);
        if(orderModel!=null) {
            orderRepo.delete(orderModel);
        }
        productRepo.deleteById(id);
        return "Product deleted";
    }
}
