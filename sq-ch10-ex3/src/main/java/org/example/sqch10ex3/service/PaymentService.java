package org.example.sqch10ex3.service;

import org.example.sqch10ex3.exceptions.NotEnoughMoneyException;
import org.example.sqch10ex3.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }

}
