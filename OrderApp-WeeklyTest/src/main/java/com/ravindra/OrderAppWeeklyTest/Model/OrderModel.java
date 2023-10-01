package com.ravindra.OrderAppWeeklyTest.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Order_Table")
public class OrderModel {

    @Id
    private int orderId;

    @ManyToOne
    @JoinColumn(name = "fk-user-order")
    UserModel userModel;

    @ManyToMany(cascade = {CascadeType.REMOVE})
    @JoinTable(name = "Order_Product", joinColumns = @JoinColumn(name = "Order_Id"), inverseJoinColumns = @JoinColumn(name = "Product_Id"))
    List<ProductModel> productModel;

    @ManyToOne
    @JoinColumn(name = "fk-address-order")
    AddressModel addressModel;

    private int productQuantity;

}
