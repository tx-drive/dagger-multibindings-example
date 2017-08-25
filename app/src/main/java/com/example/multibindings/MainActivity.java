package com.example.multibindings;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.multibindings.di.component.DaggerAppComponent;
import com.example.multibindings.structure.payment.Payment;

import java.util.Set;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Set<Payment> paymentMethods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerAppComponent.builder()
                .build()
                .inject(this);

        StringBuilder paymentMethodsString = new StringBuilder("Payment methods: ");

        for (Payment payment : paymentMethods) {
            paymentMethodsString.append(payment.getName()).append(", ");
        }
        paymentMethodsString.delete(paymentMethodsString.length() - 2, paymentMethodsString.length());

        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText(paymentMethodsString.toString());
    }
}
