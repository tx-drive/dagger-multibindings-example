package com.example.multibindings.di.module;

import com.example.multibindings.structure.payment.Payment;
import com.example.multibindings.structure.paypal.PaypalMethod;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;

@Module
public class PaypalModule {
    @IntoSet
    @Provides
    public Payment provideMethod() {
        return new PaypalMethod();
    }
}
