package com.luv2code.ecommerce.service;

import com.luv2code.ecommerce.entity.Purchase;
import com.luv2code.ecommerce.entity.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
