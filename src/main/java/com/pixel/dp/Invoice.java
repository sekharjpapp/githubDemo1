package com.pixel.dp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Invoice {

    @Autowired
    private Marker marker;
    private int quantity;

    public int calculateTotal(int quantity) {
        int price = ((marker.getPrice()) * this.quantity);
        return price;
    }
}
