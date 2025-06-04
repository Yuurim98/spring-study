package org.example.sqch10ex3.controllers;

import org.example.sqch10ex3.exceptions.NotEnoughMoneyException;
import org.example.sqch10ex3.model.ErrorDetails;
import org.example.sqch10ex3.model.PaymentDetails;
import org.example.sqch10ex3.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<?> makePayment() {
        try {
            PaymentDetails paymentDetails = paymentService.processPayment();

            return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(paymentDetails);
        } catch (NotEnoughMoneyException e) {
            ErrorDetails errorDetails = new ErrorDetails();
            errorDetails.setMessage("잔액이 부족합니다.");
            return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(errorDetails);
        }
    }
}
