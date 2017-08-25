package com.example.multibindings.structure.creditcard;

import com.example.multibindings.structure.payment.Payment;

public class CreditCardMethod implements Payment {

    @Override
    public String getName() {
        return "Credit Card";
    }
}
