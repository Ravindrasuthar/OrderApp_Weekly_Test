package com.ravindra.OrderAppWeeklyTest.Repo;

import com.ravindra.OrderAppWeeklyTest.Model.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IUserRepo extends CrudRepository<UserModel, Integer> {
}
