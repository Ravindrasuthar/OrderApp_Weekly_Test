package com.ravindra.OrderAppWeeklyTest.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "User_Table")
public class UserModel {

    @Id
    private int userId;
    private String userName;
    private String userEmail;
    private String userPassword;
    private String userPhoneNumber;
}
