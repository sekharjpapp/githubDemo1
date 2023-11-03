package com.pixel.ocp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
abstract public class Employee {

    private int id;
    private String name;
    private String department;
    private boolean working;

    public abstract void performDuties();
}
