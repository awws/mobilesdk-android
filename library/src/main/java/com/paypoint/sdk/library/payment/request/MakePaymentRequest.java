/*
 * Copyright (c) 2015. PayPoint
 */

package com.paypoint.sdk.library.payment.request;

import com.google.gson.annotations.SerializedName;

/**
 * Who:  Pete
 * When: 09/04/2015
 * What:
 */
public class MakePaymentRequest {

    @SerializedName("transaction")
    private Transaction transaction;

    @SerializedName("paymentMethod")
    private PaymentMethod paymentMethod;

    public MakePaymentRequest setTransaction(Transaction transaction) {
        this.transaction = transaction;
        return this;
    }

    public MakePaymentRequest setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }
}