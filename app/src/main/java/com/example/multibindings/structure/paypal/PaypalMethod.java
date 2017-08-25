package com.example.multibindings.structure.paypal;

import com.example.multibindings.structure.payment.Payment;

public class PaypalMethod implements Payment {

    @Override
    public String getName() {
        return "Paypal";
    }
}
