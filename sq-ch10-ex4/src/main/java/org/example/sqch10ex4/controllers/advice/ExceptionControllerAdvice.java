package org.example.sqch10ex4.controllers.advice;

import org.example.sqch10ex4.exceptions.NotEnoughMoneyException;
import org.example.sqch10ex4.model.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(NotEnoughMoneyException.class) // NotEnoughMoneyException 예외가 발생했을 때
    public ResponseEntity<ErrorDetails> exceptionNotEnoughMoneyHandler() {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("잔액이 부족합니다.");
        return ResponseEntity
            .status(HttpStatus.BAD_REQUEST)
            .body(errorDetails);
    }
}
