package com.ravindra.OrderAppWeeklyTest.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Product_Table")
public class ProductModel {

    @Id
    private int productId;
    private String productName;
    private int productPrice;
    private String productDes;
    private String productCategory;
    private String productBrand;
}
