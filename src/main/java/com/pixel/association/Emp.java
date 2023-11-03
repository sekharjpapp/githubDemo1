package com.pixel.association;

import lombok.Data;

@Data
public class Emp {

    private String empId;
    private String firstName;
    private String lastName;
    private int age;

    private Address address;
}
