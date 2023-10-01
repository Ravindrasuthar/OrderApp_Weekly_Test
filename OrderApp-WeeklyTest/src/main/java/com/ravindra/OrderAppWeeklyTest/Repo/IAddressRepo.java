package com.ravindra.OrderAppWeeklyTest.Repo;

import com.ravindra.OrderAppWeeklyTest.Model.AddressModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends CrudRepository<AddressModel, Integer> {
}
