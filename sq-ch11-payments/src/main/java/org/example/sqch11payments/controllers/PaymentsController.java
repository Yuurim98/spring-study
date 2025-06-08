package org.example.sqch11payments.controllers;

import java.util.UUID;
import java.util.logging.Logger;
import org.example.sqch11payments.model.Payment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentsController {

    private static Logger logger = Logger.getLogger(PaymentsController.class.getName());

    @PostMapping("/payment")
    public ResponseEntity<Payment> createPayment(@RequestHeader String requestId,
        @RequestBody Payment payment) {
        logger.info("요청 Id : " + requestId + ", 금액 : " + payment.getAmount());

        payment.setId(UUID.randomUUID().toString());

        return ResponseEntity
            .status(HttpStatus.OK)
            .header("requestId", requestId)
            .body(payment);
    }
}
