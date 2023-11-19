package com.example.springRush.service;

import com.example.springRush.exceptioon.NotEnoughMoneyException;
import com.example.springRush.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}