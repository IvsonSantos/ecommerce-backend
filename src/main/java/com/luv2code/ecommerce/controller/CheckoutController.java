package com.luv2code.ecommerce.controller;

import com.luv2code.ecommerce.entity.Purchase;
import com.luv2code.ecommerce.entity.PurchaseResponse;
import com.luv2code.ecommerce.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {
        PurchaseResponse response = checkoutService.placeOrder(purchase);
        return response;
    }
}
