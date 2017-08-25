package com.example.multibindings.di.component;

import com.example.multibindings.MainActivity;
import com.example.multibindings.di.module.PaymentModule;

import dagger.Component;

@Component(modules = {PaymentModule.class})
public interface AppComponent {
    void inject(MainActivity mainActivity);
}
