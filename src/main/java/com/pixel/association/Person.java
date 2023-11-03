package com.pixel.association;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Person {

    private String empId;
    private String firstName;
    private String lastName;
    private Address address;

    //Composition example
    @Builder
    public Person() {
        address = new Address();
    }
}
