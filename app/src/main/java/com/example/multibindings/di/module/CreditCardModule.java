package com.example.multibindings.di.module;

import com.example.multibindings.structure.creditcard.CreditCardMethod;
import com.example.multibindings.structure.payment.Payment;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;

@Module
public class CreditCardModule {

    @IntoSet
    @Provides
    public Payment provideMethod() {
        return  new CreditCardMethod();
    }
}
