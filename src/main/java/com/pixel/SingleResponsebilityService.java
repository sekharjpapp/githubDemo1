package com.pixel;

import com.pixel.dp.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SingleResponsebilityService {

    @Autowired
    private Invoice invoice;

    public int getInvoice() {
       return invoice.calculateTotal(10);
    }
    public void freakOut() {
        System.out.println("what ever message");
    }

    public void freakOut1() {
        System.out.println("what ever message");
    }
    
}
