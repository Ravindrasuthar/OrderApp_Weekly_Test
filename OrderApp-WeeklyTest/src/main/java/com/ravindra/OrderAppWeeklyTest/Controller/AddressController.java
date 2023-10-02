package com.ravindra.OrderAppWeeklyTest.Controller;

import com.ravindra.OrderAppWeeklyTest.Model.AddressModel;
import com.ravindra.OrderAppWeeklyTest.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("add/address")
    public String AddAddress(@RequestBody AddressModel addressModel)
    {
        return addressService.AddAddress(addressModel);
    }
}
