package com.ravindra.OrderAppWeeklyTest.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Address_Table")
public class AddressModel {

    @Id
    private int addId;

    private String addName;
    private String addLandmark;
    private String addPhoneNumber;
    private String addZipcode;
    private String state;

    @OneToOne
    @JoinColumn(name = "fk-user")
    UserModel userModel;

}
