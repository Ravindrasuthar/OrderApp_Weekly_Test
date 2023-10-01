package com.ravindra.OrderAppWeeklyTest.Service;

import com.ravindra.OrderAppWeeklyTest.Model.UserModel;
import com.ravindra.OrderAppWeeklyTest.Repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    IUserRepo userRepo;

    public String AddUser(UserModel userModel) {
        userRepo.save(userModel);
        return "User Added";
    }

    public UserModel GetUserById(Integer Id) {
        return userRepo.findById(Id).orElseThrow();
    }
}
