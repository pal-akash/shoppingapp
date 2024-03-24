package com.akash.shoppingapp.model;

import jakarta.persistence.OneToOne;

public class Order {

    private String orderId;

    private Long quantity;

    @OneToOne
    private String transactionId;
}
