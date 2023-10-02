package com.ravindra.OrderAppWeeklyTest.Controller;

import com.ravindra.OrderAppWeeklyTest.Model.OrderModel;
import com.ravindra.OrderAppWeeklyTest.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("add/order")
    public String AddOrder(@RequestBody OrderModel orderModel)
    {
        return orderService.AddOrder(orderModel);
    }

    @GetMapping("get/order/by/id/{Id}")
    public OrderModel GetOrderById(@PathVariable Integer Id)
    {
        return orderService.GetOrderById(Id);
    }
}
