package org.example.sqch11ex2.proxy;

import java.util.UUID;
import org.example.sqch11ex2.model.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PaymentsProxy {

    private final RestTemplate restTemplate;

    @Value("${name.service.url}")
    private String paymentsServiceUrl;

    public PaymentsProxy(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Payment createPayment(Payment payment) {
        String uri = paymentsServiceUrl + "/payment";
        String requestId = UUID.randomUUID().toString();


        HttpHeaders headers = new HttpHeaders();
        headers.add("requestId", requestId); // 헤더 정의

        HttpEntity<Payment> httpEntity = new HttpEntity<>(payment, headers); // 요청 데이터 정의

        ResponseEntity<Payment> responseEntity = restTemplate.exchange(uri, HttpMethod.POST,
            httpEntity, Payment.class);

        return responseEntity.getBody();
    }
}
