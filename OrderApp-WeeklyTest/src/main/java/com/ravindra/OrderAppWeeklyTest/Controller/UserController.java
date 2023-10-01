package com.ravindra.OrderAppWeeklyTest.Controller;

import com.ravindra.OrderAppWeeklyTest.Model.UserModel;
import com.ravindra.OrderAppWeeklyTest.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("add/user")
    public String AddUser(@RequestBody UserModel userModel)
    {
        return userService.AddUser(userModel);
    }

    @GetMapping("get/user/by/id/{Id}")
    public UserModel GetUserById(@PathVariable Integer Id)
    {
        return userService.GetUserById(Id);
    }

}
