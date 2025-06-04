package org.example.sqch10ex4.service;

import org.example.sqch10ex4.exceptions.NotEnoughMoneyException;
import org.example.sqch10ex4.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }

}
