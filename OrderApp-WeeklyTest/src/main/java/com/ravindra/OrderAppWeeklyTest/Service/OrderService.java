package com.ravindra.OrderAppWeeklyTest.Service;

import com.ravindra.OrderAppWeeklyTest.Model.OrderModel;
import com.ravindra.OrderAppWeeklyTest.Repo.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    IOrderRepo orderRepo;

    public String AddOrder(OrderModel orderModel) {
        orderRepo.save(orderModel);
        return "Order Added";
    }

    public OrderModel GetOrderById(Integer Id) {
        return orderRepo.findById(Id).orElseThrow();
    }
}
