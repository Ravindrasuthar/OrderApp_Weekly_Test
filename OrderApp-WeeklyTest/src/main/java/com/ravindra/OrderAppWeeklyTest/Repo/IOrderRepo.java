package com.ravindra.OrderAppWeeklyTest.Repo;

import com.ravindra.OrderAppWeeklyTest.Model.OrderModel;
import com.ravindra.OrderAppWeeklyTest.Model.ProductModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends CrudRepository<OrderModel, Integer> {

    OrderModel findByproductModel(ProductModel productModel);
}
