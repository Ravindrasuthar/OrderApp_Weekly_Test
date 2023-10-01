package com.ravindra.OrderAppWeeklyTest.Service;

import com.ravindra.OrderAppWeeklyTest.Model.AddressModel;
import com.ravindra.OrderAppWeeklyTest.Repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;

    public String AddAddress(AddressModel addressModel) {
        addressRepo.save(addressModel);
        return "Address Added";
    }
}
