package com.example.springRush.controller;

import com.example.springRush.exceptioon.NotEnoughMoneyException;
import com.example.springRush.model.ErrorDetails;
import com.example.springRush.model.PaymentDetails;
import com.example.springRush.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class PaymentController {

    private final PaymentService paymentService;
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    private static Logger logger =
            Logger.getLogger(PaymentController.class.getName());
//    @PostMapping("/payment")
//    public ResponseEntity<PaymentDetails> makePayment(
//            @RequestBody PaymentDetails paymentDetails) {
//        logger.info("Received payment " +
//                paymentDetails.getAmount());
//        return ResponseEntity
//                .status(HttpStatus.ACCEPTED)
//                .body(paymentDetails);
//    }

//    @PostMapping("/payment")
//    public ResponseEntity<PaymentDetails> makePayment() {
//        PaymentDetails paymentDetails = paymentService.processPayment();
//        return ResponseEntity
//                .status(HttpStatus.ACCEPTED)
//                .body(paymentDetails);
//    }

//    @PostMapping("/payment")
//    public ResponseEntity<?> makePayment() {
//        try {
//            PaymentDetails paymentDetails =
//                    paymentService.processPayment();
//            return ResponseEntity
//                    .status(HttpStatus.ACCEPTED)
//                    .body(paymentDetails);
//        } catch (NotEnoughMoneyException e) {
//            ErrorDetails errorDetails = new ErrorDetails();
//            errorDetails.setMessage("Not enough money to make the payment.");
//            return ResponseEntity
//                    .badRequest()
//                    .body(errorDetails);
//        }
//    }
}