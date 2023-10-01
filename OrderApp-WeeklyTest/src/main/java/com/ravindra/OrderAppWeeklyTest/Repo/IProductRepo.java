package com.ravindra.OrderAppWeeklyTest.Repo;

import com.ravindra.OrderAppWeeklyTest.Model.ProductModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepo extends CrudRepository<ProductModel, Integer> {
    @Query("Select p from ProductModel p Where p.productCategory =:cat")
    public List<ProductModel> GetAllProductByCategory(@Param("cat") String category);
}
