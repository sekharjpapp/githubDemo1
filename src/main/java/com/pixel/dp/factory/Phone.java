package com.pixel.dp.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {
    protected List<Specification> specifications = new ArrayList<>();
    public Phone() {
        createPhone();
    }
    protected abstract void createPhone();
}
