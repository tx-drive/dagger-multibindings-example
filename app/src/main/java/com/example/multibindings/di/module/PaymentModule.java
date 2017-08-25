package com.example.multibindings.di.module;

import com.example.multibindings.structure.payment.Payment;

import java.util.Set;

import dagger.Module;
import dagger.multibindings.Multibinds;

@Module(includes = {CreditCardModule.class, PaypalModule.class})
public abstract class PaymentModule {

    @Multibinds
    abstract public Set<Payment> payments();
}
